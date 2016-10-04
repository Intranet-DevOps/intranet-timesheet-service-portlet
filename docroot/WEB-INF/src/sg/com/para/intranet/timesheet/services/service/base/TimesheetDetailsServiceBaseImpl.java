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

package sg.com.para.intranet.timesheet.services.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import sg.com.para.intranet.timesheet.services.model.TimesheetDetails;
import sg.com.para.intranet.timesheet.services.service.TimesheetDetailsService;
import sg.com.para.intranet.timesheet.services.service.persistence.TimesheetDetailsPersistence;
import sg.com.para.intranet.timesheet.services.service.persistence.TimesheetPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the timesheet details remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link sg.com.para.intranet.timesheet.services.service.impl.TimesheetDetailsServiceImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.timesheet.services.service.impl.TimesheetDetailsServiceImpl
 * @see sg.com.para.intranet.timesheet.services.service.TimesheetDetailsServiceUtil
 * @generated
 */
public abstract class TimesheetDetailsServiceBaseImpl extends BaseServiceImpl
	implements TimesheetDetailsService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sg.com.para.intranet.timesheet.services.service.TimesheetDetailsServiceUtil} to access the timesheet details remote service.
	 */

	/**
	 * Returns the timesheet local service.
	 *
	 * @return the timesheet local service
	 */
	public sg.com.para.intranet.timesheet.services.service.TimesheetLocalService getTimesheetLocalService() {
		return timesheetLocalService;
	}

	/**
	 * Sets the timesheet local service.
	 *
	 * @param timesheetLocalService the timesheet local service
	 */
	public void setTimesheetLocalService(
		sg.com.para.intranet.timesheet.services.service.TimesheetLocalService timesheetLocalService) {
		this.timesheetLocalService = timesheetLocalService;
	}

	/**
	 * Returns the timesheet remote service.
	 *
	 * @return the timesheet remote service
	 */
	public sg.com.para.intranet.timesheet.services.service.TimesheetService getTimesheetService() {
		return timesheetService;
	}

	/**
	 * Sets the timesheet remote service.
	 *
	 * @param timesheetService the timesheet remote service
	 */
	public void setTimesheetService(
		sg.com.para.intranet.timesheet.services.service.TimesheetService timesheetService) {
		this.timesheetService = timesheetService;
	}

	/**
	 * Returns the timesheet persistence.
	 *
	 * @return the timesheet persistence
	 */
	public TimesheetPersistence getTimesheetPersistence() {
		return timesheetPersistence;
	}

	/**
	 * Sets the timesheet persistence.
	 *
	 * @param timesheetPersistence the timesheet persistence
	 */
	public void setTimesheetPersistence(
		TimesheetPersistence timesheetPersistence) {
		this.timesheetPersistence = timesheetPersistence;
	}

	/**
	 * Returns the timesheet details local service.
	 *
	 * @return the timesheet details local service
	 */
	public sg.com.para.intranet.timesheet.services.service.TimesheetDetailsLocalService getTimesheetDetailsLocalService() {
		return timesheetDetailsLocalService;
	}

	/**
	 * Sets the timesheet details local service.
	 *
	 * @param timesheetDetailsLocalService the timesheet details local service
	 */
	public void setTimesheetDetailsLocalService(
		sg.com.para.intranet.timesheet.services.service.TimesheetDetailsLocalService timesheetDetailsLocalService) {
		this.timesheetDetailsLocalService = timesheetDetailsLocalService;
	}

	/**
	 * Returns the timesheet details remote service.
	 *
	 * @return the timesheet details remote service
	 */
	public sg.com.para.intranet.timesheet.services.service.TimesheetDetailsService getTimesheetDetailsService() {
		return timesheetDetailsService;
	}

	/**
	 * Sets the timesheet details remote service.
	 *
	 * @param timesheetDetailsService the timesheet details remote service
	 */
	public void setTimesheetDetailsService(
		sg.com.para.intranet.timesheet.services.service.TimesheetDetailsService timesheetDetailsService) {
		this.timesheetDetailsService = timesheetDetailsService;
	}

	/**
	 * Returns the timesheet details persistence.
	 *
	 * @return the timesheet details persistence
	 */
	public TimesheetDetailsPersistence getTimesheetDetailsPersistence() {
		return timesheetDetailsPersistence;
	}

	/**
	 * Sets the timesheet details persistence.
	 *
	 * @param timesheetDetailsPersistence the timesheet details persistence
	 */
	public void setTimesheetDetailsPersistence(
		TimesheetDetailsPersistence timesheetDetailsPersistence) {
		this.timesheetDetailsPersistence = timesheetDetailsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return TimesheetDetails.class;
	}

	protected String getModelClassName() {
		return TimesheetDetails.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = timesheetDetailsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = sg.com.para.intranet.timesheet.services.service.TimesheetLocalService.class)
	protected sg.com.para.intranet.timesheet.services.service.TimesheetLocalService timesheetLocalService;
	@BeanReference(type = sg.com.para.intranet.timesheet.services.service.TimesheetService.class)
	protected sg.com.para.intranet.timesheet.services.service.TimesheetService timesheetService;
	@BeanReference(type = TimesheetPersistence.class)
	protected TimesheetPersistence timesheetPersistence;
	@BeanReference(type = sg.com.para.intranet.timesheet.services.service.TimesheetDetailsLocalService.class)
	protected sg.com.para.intranet.timesheet.services.service.TimesheetDetailsLocalService timesheetDetailsLocalService;
	@BeanReference(type = sg.com.para.intranet.timesheet.services.service.TimesheetDetailsService.class)
	protected sg.com.para.intranet.timesheet.services.service.TimesheetDetailsService timesheetDetailsService;
	@BeanReference(type = TimesheetDetailsPersistence.class)
	protected TimesheetDetailsPersistence timesheetDetailsPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private TimesheetDetailsServiceClpInvoker _clpInvoker = new TimesheetDetailsServiceClpInvoker();
}