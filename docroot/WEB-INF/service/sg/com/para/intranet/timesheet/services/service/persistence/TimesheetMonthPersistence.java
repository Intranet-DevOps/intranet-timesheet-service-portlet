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

package sg.com.para.intranet.timesheet.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import sg.com.para.intranet.timesheet.services.model.TimesheetMonth;

/**
 * The persistence interface for the timesheet month service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetMonthPersistenceImpl
 * @see TimesheetMonthUtil
 * @generated
 */
public interface TimesheetMonthPersistence extends BasePersistence<TimesheetMonth> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TimesheetMonthUtil} to access the timesheet month persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the timesheet month in the entity cache if it is enabled.
	*
	* @param timesheetMonth the timesheet month
	*/
	public void cacheResult(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth);

	/**
	* Caches the timesheet months in the entity cache if it is enabled.
	*
	* @param timesheetMonths the timesheet months
	*/
	public void cacheResult(
		java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> timesheetMonths);

	/**
	* Creates a new timesheet month with the primary key. Does not add the timesheet month to the database.
	*
	* @param timesheetMonthId the primary key for the new timesheet month
	* @return the new timesheet month
	*/
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth create(
		int timesheetMonthId);

	/**
	* Removes the timesheet month with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param timesheetMonthId the primary key of the timesheet month
	* @return the timesheet month that was removed
	* @throws sg.com.para.intranet.timesheet.services.NoSuchTimesheetMonthException if a timesheet month with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth remove(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.timesheet.services.NoSuchTimesheetMonthException;

	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth updateImpl(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the timesheet month with the primary key or throws a {@link sg.com.para.intranet.timesheet.services.NoSuchTimesheetMonthException} if it could not be found.
	*
	* @param timesheetMonthId the primary key of the timesheet month
	* @return the timesheet month
	* @throws sg.com.para.intranet.timesheet.services.NoSuchTimesheetMonthException if a timesheet month with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth findByPrimaryKey(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.SystemException,
			sg.com.para.intranet.timesheet.services.NoSuchTimesheetMonthException;

	/**
	* Returns the timesheet month with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param timesheetMonthId the primary key of the timesheet month
	* @return the timesheet month, or <code>null</code> if a timesheet month with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth fetchByPrimaryKey(
		int timesheetMonthId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the timesheet months.
	*
	* @return the timesheet months
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the timesheet months.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sg.com.para.intranet.timesheet.services.model.impl.TimesheetMonthModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of timesheet months
	* @param end the upper bound of the range of timesheet months (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of timesheet months
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the timesheet months from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of timesheet months.
	*
	* @return the number of timesheet months
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}