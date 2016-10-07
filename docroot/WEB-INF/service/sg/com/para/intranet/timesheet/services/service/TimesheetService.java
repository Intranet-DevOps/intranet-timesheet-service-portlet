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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Timesheet. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Fernando Karnagi
 * @see TimesheetServiceUtil
 * @see sg.com.para.intranet.timesheet.services.service.base.TimesheetServiceBaseImpl
 * @see sg.com.para.intranet.timesheet.services.service.impl.TimesheetServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface TimesheetService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimesheetServiceUtil} to access the timesheet remote service. Add custom service methods to {@link sg.com.para.intranet.timesheet.services.service.impl.TimesheetServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public sg.com.para.intranet.timesheet.services.model.Timesheet getTimesheet(
		int timesheetId, java.lang.String actor) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> getTimesheetMonth(
		int year, int month, java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception;

	public java.util.List<sg.com.para.intranet.timesheet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetDetails> getTimesheetDetails(
		int timesheetId, java.lang.String actor) throws java.lang.Exception;

	public sg.com.para.intranet.timesheet.services.model.TimesheetDetails addTimesheetDetails(
		int timesheetId, java.util.Date logDate, java.lang.String clockInTime,
		java.lang.String clockOutTime, java.lang.String type,
		java.lang.String remarks, java.lang.String fulldayOrTimeBased,
		java.lang.String actor) throws java.lang.Exception;

	public void deleteTimesheetDetails(int timesheetDetailsId,
		java.lang.String actor) throws java.lang.Exception;

	public sg.com.para.intranet.timesheet.services.model.Timesheet createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode, long logDate, java.lang.String actor)
		throws java.lang.Exception;

	public sg.com.para.intranet.timesheet.services.model.Timesheet updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode, long logDate,
		java.lang.String actor) throws java.lang.Exception;

	public void deleteTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception;

	public void approveTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception;

	public void rejectTimeSheet(int timesheetId, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception;

	public void submitMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception;

	public void rejectMonth(int year, int month, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception;

	public void approveMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception;
}