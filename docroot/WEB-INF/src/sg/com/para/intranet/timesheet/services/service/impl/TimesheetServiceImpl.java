/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package sg.com.para.intranet.timesheet.services.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sg.com.para.intranet.timesheet.services.model.Timesheet;
import sg.com.para.intranet.timesheet.services.model.TimesheetDetails;
import sg.com.para.intranet.timesheet.services.model.bean.TimesheetBean;
import sg.com.para.intranet.timesheet.services.service.base.TimesheetServiceBaseImpl;
import sg.com.para.intranet.timsheet.services.util.DateUtils;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the timesheet remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link sg.com.para.intranet.timesheet.services.service.TimesheetService}
 * interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.timesheet.services.service.base.TimesheetServiceBaseImpl
 * @see sg.com.para.intranet.timesheet.services.service.TimesheetServiceUtil
 */
public class TimesheetServiceImpl extends TimesheetServiceBaseImpl {

	private static Log _log = LogFactoryUtil.getLog(TimesheetServiceImpl.class);

	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * sg.com.para.intranet.timesheet.services.service.TimesheetServiceUtil} to
	 * access the timesheet remote service.
	 */

	public Timesheet getTimesheet(int timesheetId, String actor) throws Exception {
		_log.info("getTimesheet [timesheetId: " + timesheetId + "]");
		return timesheetPersistence.findByPrimaryKey(timesheetId);
	}

	private Timesheet isTimesheetPresent(Date date, List<Timesheet> timesheets) {
		for (Timesheet timesheet : timesheets) {
			if (timesheet.getLogDate() != null) {
				if (DateUtils.isSameDate(date, timesheet.getLogDate())) {
					return timesheet;
				}
			}
		}
		return null;
	}

	public List<Timesheet> findTimesheetsByUser(Date startDate, Date endDate, String userId, String actor)
			throws Exception {
		_log.info("findTimesheetsByUser [startDate: " + startDate + ", endDate: " + endDate + ", userId: " + userId
				+ "]");

		DynamicQuery dynaQuery = DynamicQueryFactoryUtil.forClass(Timesheet.class, getClass().getClassLoader())
				.add(PropertyFactoryUtil.forName("employeeScreenName").eq(userId))
				.addOrder(OrderFactoryUtil.asc("logDate"));

		List<Timesheet> timesheets = timesheetPersistence.findWithDynamicQuery(dynaQuery);
		_log.info("find with dynamic query [timesheets: " + timesheets + "]");
		List<Timesheet> timesheetsRet = new ArrayList<Timesheet>();
		int currentTime = (int) new Date().getTime();
		while (startDate.before(endDate)) {
			Timesheet existingTimesheet = isTimesheetPresent(startDate, timesheets);
			if (existingTimesheet == null) {
				currentTime++;
				existingTimesheet = new TimesheetBean();
				existingTimesheet.setTimesheetId(currentTime);
				existingTimesheet.setEmployeeScreenName(userId);
				existingTimesheet.setLogDate(startDate);
			}

			timesheetsRet.add(existingTimesheet);
			startDate = DateUtils.increaseDay(startDate, 1);
		}

		return timesheetsRet;
	}

	public List<TimesheetDetails> getTimesheetDetails(int timesheetId, String actor) throws Exception {
		_log.info("getTimesheetDetails [timesheetId: " + timesheetId + ", actor: " + actor);

		DynamicQuery dynaQuery = DynamicQueryFactoryUtil.forClass(TimesheetDetails.class, getClass().getClassLoader())
				.add(PropertyFactoryUtil.forName("timesheetId").eq(timesheetId))
				.addOrder(OrderFactoryUtil.asc("clockInTime"));

		List<TimesheetDetails> timesheetDetails = timesheetDetailsPersistence.findWithDynamicQuery(dynaQuery);
		return timesheetDetails;
	}

	public TimesheetDetails addTimesheetDetails(int timesheetId, Date logDate, String clockInTime, String clockOutTime,
			String type, String remarks, String fulldayOrTimeBased, String actor) throws Exception {
		_log.info("addTimesheetDetails [timesheetId: " + timesheetId + ", logDate: " + logDate + ", clockInTime: "
				+ clockInTime + ", clockOutTime: " + clockOutTime + ", fulldayOrTimeBased: " + fulldayOrTimeBased
				+ ", type: " + type + ", actor: " + actor);

		SimpleDateFormat sdfFullTime = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		Date clockInTimeDt = sdfFullTime.parse(sdfDate.format(logDate) + " " + clockInTime);
		Date clockOutTimeDt = sdfFullTime.parse(sdfDate.format(logDate) + " " + clockOutTime);

		TimesheetDetails timesheetDetails = timesheetDetailsLocalService
				.createTimesheetDetails((int) CounterLocalServiceUtil.increment(TimesheetDetails.class.toString()));
		timesheetDetails.setClockInTime(clockInTimeDt);
		timesheetDetails.setClockOutTime(clockOutTimeDt);
		timesheetDetails.setRemarks(remarks);
		timesheetDetails.setFulldayOrTimeBased(fulldayOrTimeBased);
		timesheetDetails.setType(type);

		Timesheet timesheet = timesheetLocalService.fetchTimesheet((int) timesheetId);
		if (timesheet == null) {
			timesheet = createTimeSheet(actor, 0d, 0d, 0d, 0d, 0d, 0d, 0d, "-", "NEW", "", logDate.getTime(), actor);
		}

		timesheetDetails.setTimesheetId(timesheet.getTimesheetId());

		timesheetDetailsPersistence.update(timesheetDetails);
		return timesheetDetails;

	}

	public void deleteTimesheetDetails(int timesheetDetailsId, String actor) throws Exception {
		_log.info("deleteTimesheetDetails [timesheetDetailsId: " + timesheetDetailsId + ", actor: " + actor + "]");
		timesheetDetailsPersistence.remove(timesheetDetailsId);
	}

	public Timesheet createTimeSheet(String employeeScreenName, double regular, double overtime, double sick,
			double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode, long logDate, String actor) throws Exception {
		_log.info("createTimeSheet");
		Timesheet timesheet = timesheetLocalService.createTimesheet((int) CounterLocalServiceUtil
				.increment(Timesheet.class.toString()));
		timesheet.setEmployeeScreenName(employeeScreenName);
		timesheet.setRegular(regular);
		timesheet.setLogDate(new Date());
		timesheet.setOvertime(overtime);
		timesheet.setSick(sick);
		timesheet.setVacation(vacation);
		timesheet.setHoliday(holiday);
		timesheet.setUnpaid(unpaid);
		timesheet.setOther(other);
		timesheet.setRemarks(remarks);
		timesheet.setLogDate(new Date(logDate));
		timesheet.setStatus(status);
		timesheet.setProjectCode(projectCode);

		timesheetLocalService.updateTimesheet(timesheet);

		return timesheet;
	}

	public Timesheet updateTimeSheet(int timesheetId, String employeeScreenName, double regular, double overtime,
			double sick, double vacation, double holiday, double unpaid, double other, String remarks, String status,
			String projectCode, long logDate, String actor) throws Exception {
		_log.info("updateTimeSheet [timesheetId: " + timesheetId + ", employeeScreenName: " + employeeScreenName
				+ ", regular " + regular + ", overtime: " + overtime + ", sick: " + sick + ", vacation: " + vacation
				+ ", unpaid: " + unpaid + ", other: " + other + ", remarks: " + remarks + ", status: " + status
				+ ", projectCode: " + projectCode + "]");
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		if (timesheet == null) {
			timesheet = timesheetLocalService.createTimesheet((int) CounterLocalServiceUtil.increment(Timesheet.class
					.toString()));
		}
		timesheet.setEmployeeScreenName(employeeScreenName);
		timesheet.setRegular(regular);
		timesheet.setOvertime(overtime);
		timesheet.setSick(sick);
		timesheet.setVacation(vacation);
		timesheet.setHoliday(holiday);
		timesheet.setUnpaid(unpaid);
		timesheet.setOther(other);
		timesheet.setRemarks(remarks);
		timesheet.setLogDate(new Date(logDate));
		timesheet.setStatus(status);
		timesheet.setProjectCode(projectCode);

		timesheet = timesheetLocalService.updateTimesheet(timesheet);

		return timesheet;
	}

	public void deleteTimeSheet(int timesheetId, String actor) throws Exception {
		_log.info("deleteTimeSheet [timesheetId: " + timesheetId + ", by approver: " + actor + "]");
		timesheetLocalService.deleteTimesheet(timesheetId);
	}

	public void approveTimeSheet(int timesheetId, String actor) throws Exception {
		_log.info("approveTimeSheet [timesheetId: " + timesheetId + ", by approver: " + actor + "]");
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		timesheet.setStatus("APPROVED");
		timesheetLocalService.updateTimesheet(timesheet);
	}

	public void rejectTimeSheet(int timesheetId, String comment, String actor) throws Exception {
		_log.info("approveTimeSheet [timesheetId: " + timesheetId + ", by approver: " + actor + ", comment: " + comment
				+ "]");
		Timesheet timesheet = timesheetLocalService.fetchTimesheet(timesheetId);
		timesheet.setStatus("REJECTED");
		timesheetLocalService.updateTimesheet(timesheet);
	}

	public void submitMonth(int year, int month, String userId, String actor) throws Exception {
		_log.info("submitMonth [year: " + year + ", month: " + month + ", userId: " + userId + "]");
	}

	public void rejectMonth(int year, int month, String comment, String actor) throws Exception {
		_log.info("rejectMonth [year: " + year + ", month: " + month + ", by approver: " + actor + ", comment: "
				+ comment + "]");
	}

	public void approveMonth(int year, int month, String userId, String actor) throws Exception {
		_log.info("approveMonth [year: " + year + ", month: " + month + ", userId: " + userId + "]");
	}
}