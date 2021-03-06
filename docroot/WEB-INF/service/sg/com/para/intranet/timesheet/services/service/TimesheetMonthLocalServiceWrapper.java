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
 * Provides a wrapper for {@link TimesheetMonthLocalService}.
 *
 * @author Fernando Karnagi
 * @see TimesheetMonthLocalService
 * @generated
 */
public class TimesheetMonthLocalServiceWrapper
	implements TimesheetMonthLocalService,
		ServiceWrapper<TimesheetMonthLocalService> {
	public TimesheetMonthLocalServiceWrapper(
		TimesheetMonthLocalService timesheetMonthLocalService) {
		_timesheetMonthLocalService = timesheetMonthLocalService;
	}

	/**
	* Adds the timesheet month to the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetMonth the timesheet month
	* @return the timesheet month that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth addTimesheetMonth(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.addTimesheetMonth(timesheetMonth);
	}

	/**
	* Creates a new timesheet month with the primary key. Does not add the timesheet month to the database.
	*
	* @param timesheetMonthId the primary key for the new timesheet month
	* @return the new timesheet month
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth createTimesheetMonth(
		int timesheetMonthId) {
		return _timesheetMonthLocalService.createTimesheetMonth(timesheetMonthId);
	}

	/**
	* Deletes the timesheet month with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetMonthId the primary key of the timesheet month
	* @return the timesheet month that was removed
	* @throws PortalException if a timesheet month with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth deleteTimesheetMonth(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.deleteTimesheetMonth(timesheetMonthId);
	}

	/**
	* Deletes the timesheet month from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetMonth the timesheet month
	* @return the timesheet month that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth deleteTimesheetMonth(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.deleteTimesheetMonth(timesheetMonth);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _timesheetMonthLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.timesheet.services.model.impl.TimesheetMonthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.timesheet.services.model.impl.TimesheetMonthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth fetchTimesheetMonth(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.fetchTimesheetMonth(timesheetMonthId);
	}

	/**
	* Returns the timesheet month with the primary key.
	*
	* @param timesheetMonthId the primary key of the timesheet month
	* @return the timesheet month
	* @throws PortalException if a timesheet month with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth getTimesheetMonth(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.getTimesheetMonth(timesheetMonthId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the timesheet months.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.timesheet.services.model.impl.TimesheetMonthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheet months
	* @param end the upper bound of the range of timesheet months (not inclusive)
	* @return the range of timesheet months
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> getTimesheetMonths(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.getTimesheetMonths(start, end);
	}

	/**
	* Returns the number of timesheet months.
	*
	* @return the number of timesheet months
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTimesheetMonthsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.getTimesheetMonthsCount();
	}

	/**
	* Updates the timesheet month in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param timesheetMonth the timesheet month
	* @return the timesheet month that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth updateTimesheetMonth(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _timesheetMonthLocalService.updateTimesheetMonth(timesheetMonth);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _timesheetMonthLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_timesheetMonthLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _timesheetMonthLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TimesheetMonthLocalService getWrappedTimesheetMonthLocalService() {
		return _timesheetMonthLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTimesheetMonthLocalService(
		TimesheetMonthLocalService timesheetMonthLocalService) {
		_timesheetMonthLocalService = timesheetMonthLocalService;
	}

	@Override
	public TimesheetMonthLocalService getWrappedService() {
		return _timesheetMonthLocalService;
	}

	@Override
	public void setWrappedService(
		TimesheetMonthLocalService timesheetMonthLocalService) {
		_timesheetMonthLocalService = timesheetMonthLocalService;
	}

	private TimesheetMonthLocalService _timesheetMonthLocalService;
}