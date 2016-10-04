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

package sg.com.para.intranet.timesheet.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TimesheetService}.
 *
 * @author Fernando Karnagi
 * @see TimesheetService
 * @generated
 */
public class TimesheetServiceWrapper implements TimesheetService,
	ServiceWrapper<TimesheetService> {
	public TimesheetServiceWrapper(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timesheetService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timesheetService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timesheetService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet getTimesheet(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		return _timesheetService.getTimesheet(timesheetId, actor);
	}

	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		return _timesheetService.findTimesheetsByUser(startDate, endDate,
			userId, actor);
	}

	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetDetails> getTimesheetDetails(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		return _timesheetService.getTimesheetDetails(timesheetId, actor);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetDetails addTimesheetDetails(
		int timesheetId, java.util.Date logDate, java.lang.String clockInTime,
		java.lang.String clockOutTime, java.lang.String type,
		java.lang.String remarks, java.lang.String fulldayOrTimeBased,
		java.lang.String actor) throws java.lang.Exception {
		return _timesheetService.addTimesheetDetails(timesheetId, logDate,
			clockInTime, clockOutTime, type, remarks, fulldayOrTimeBased, actor);
	}

	@Override
	public void deleteTimesheetDetails(int timesheetDetailsId,
		java.lang.String actor) throws java.lang.Exception {
		_timesheetService.deleteTimesheetDetails(timesheetDetailsId, actor);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode, long logDate, java.lang.String actor)
		throws java.lang.Exception {
		return _timesheetService.createTimeSheet(employeeScreenName, regular,
			overtime, sick, vacation, holiday, unpaid, other, remarks, status,
			projectCode, logDate, actor);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode, long logDate,
		java.lang.String actor) throws java.lang.Exception {
		return _timesheetService.updateTimeSheet(timesheetId,
			employeeScreenName, regular, overtime, sick, vacation, holiday,
			unpaid, other, remarks, status, projectCode, logDate, actor);
	}

	@Override
	public void deleteTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		_timesheetService.deleteTimeSheet(timesheetId, actor);
	}

	@Override
	public void approveTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		_timesheetService.approveTimeSheet(timesheetId, actor);
	}

	@Override
	public void rejectTimeSheet(int timesheetId, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception {
		_timesheetService.rejectTimeSheet(timesheetId, comment, actor);
	}

	@Override
	public void submitMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception {
		_timesheetService.submitMonth(year, month, userId, actor);
	}

	@Override
	public void rejectMonth(int year, int month, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception {
		_timesheetService.rejectMonth(year, month, comment, actor);
	}

	@Override
	public void approveMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception {
		_timesheetService.approveMonth(year, month, userId, actor);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimesheetService getWrappedTimesheetService() {
		return _timesheetService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimesheetService(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	@Override
	public TimesheetService getWrappedService() {
		return _timesheetService;
	}

	@Override
	public void setWrappedService(TimesheetService timesheetService) {
		_timesheetService = timesheetService;
	}

	private TimesheetService _timesheetService;
}