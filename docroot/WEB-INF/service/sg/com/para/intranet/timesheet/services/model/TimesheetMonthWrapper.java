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

package sg.com.para.intranet.timesheet.services.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TimesheetMonth}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetMonth
 * @generated
 */
public class TimesheetMonthWrapper implements TimesheetMonth,
	ModelWrapper<TimesheetMonth> {
	public TimesheetMonthWrapper(TimesheetMonth timesheetMonth) {
		_timesheetMonth = timesheetMonth;
	}

	@Override
	public Class<?> getModelClass() {
		return TimesheetMonth.class;
	}

	@Override
	public String getModelClassName() {
		return TimesheetMonth.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetMonthId", getTimesheetMonthId());
		attributes.put("month", getMonth());
		attributes.put("year", getYear());
		attributes.put("employeeScreenName", getEmployeeScreenName());
		attributes.put("status", getStatus());
		attributes.put("submittedDate", getSubmittedDate());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("processedBy", getProcessedBy());
		attributes.put("processedDate", getProcessedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer timesheetMonthId = (Integer)attributes.get("timesheetMonthId");

		if (timesheetMonthId != null) {
			setTimesheetMonthId(timesheetMonthId);
		}

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String employeeScreenName = (String)attributes.get("employeeScreenName");

		if (employeeScreenName != null) {
			setEmployeeScreenName(employeeScreenName);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date submittedDate = (Date)attributes.get("submittedDate");

		if (submittedDate != null) {
			setSubmittedDate(submittedDate);
		}

		String approvedBy = (String)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String processedBy = (String)attributes.get("processedBy");

		if (processedBy != null) {
			setProcessedBy(processedBy);
		}

		Date processedDate = (Date)attributes.get("processedDate");

		if (processedDate != null) {
			setProcessedDate(processedDate);
		}
	}

	/**
	* Returns the primary key of this timesheet month.
	*
	* @return the primary key of this timesheet month
	*/
	@Override
	public int getPrimaryKey() {
		return _timesheetMonth.getPrimaryKey();
	}

	/**
	* Sets the primary key of this timesheet month.
	*
	* @param primaryKey the primary key of this timesheet month
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_timesheetMonth.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the timesheet month ID of this timesheet month.
	*
	* @return the timesheet month ID of this timesheet month
	*/
	@Override
	public int getTimesheetMonthId() {
		return _timesheetMonth.getTimesheetMonthId();
	}

	/**
	* Sets the timesheet month ID of this timesheet month.
	*
	* @param timesheetMonthId the timesheet month ID of this timesheet month
	*/
	@Override
	public void setTimesheetMonthId(int timesheetMonthId) {
		_timesheetMonth.setTimesheetMonthId(timesheetMonthId);
	}

	/**
	* Returns the month of this timesheet month.
	*
	* @return the month of this timesheet month
	*/
	@Override
	public int getMonth() {
		return _timesheetMonth.getMonth();
	}

	/**
	* Sets the month of this timesheet month.
	*
	* @param month the month of this timesheet month
	*/
	@Override
	public void setMonth(int month) {
		_timesheetMonth.setMonth(month);
	}

	/**
	* Returns the year of this timesheet month.
	*
	* @return the year of this timesheet month
	*/
	@Override
	public int getYear() {
		return _timesheetMonth.getYear();
	}

	/**
	* Sets the year of this timesheet month.
	*
	* @param year the year of this timesheet month
	*/
	@Override
	public void setYear(int year) {
		_timesheetMonth.setYear(year);
	}

	/**
	* Returns the employee screen name of this timesheet month.
	*
	* @return the employee screen name of this timesheet month
	*/
	@Override
	public java.lang.String getEmployeeScreenName() {
		return _timesheetMonth.getEmployeeScreenName();
	}

	/**
	* Sets the employee screen name of this timesheet month.
	*
	* @param employeeScreenName the employee screen name of this timesheet month
	*/
	@Override
	public void setEmployeeScreenName(java.lang.String employeeScreenName) {
		_timesheetMonth.setEmployeeScreenName(employeeScreenName);
	}

	/**
	* Returns the status of this timesheet month.
	*
	* @return the status of this timesheet month
	*/
	@Override
	public java.lang.String getStatus() {
		return _timesheetMonth.getStatus();
	}

	/**
	* Sets the status of this timesheet month.
	*
	* @param status the status of this timesheet month
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_timesheetMonth.setStatus(status);
	}

	/**
	* Returns the submitted date of this timesheet month.
	*
	* @return the submitted date of this timesheet month
	*/
	@Override
	public java.util.Date getSubmittedDate() {
		return _timesheetMonth.getSubmittedDate();
	}

	/**
	* Sets the submitted date of this timesheet month.
	*
	* @param submittedDate the submitted date of this timesheet month
	*/
	@Override
	public void setSubmittedDate(java.util.Date submittedDate) {
		_timesheetMonth.setSubmittedDate(submittedDate);
	}

	/**
	* Returns the approved by of this timesheet month.
	*
	* @return the approved by of this timesheet month
	*/
	@Override
	public java.lang.String getApprovedBy() {
		return _timesheetMonth.getApprovedBy();
	}

	/**
	* Sets the approved by of this timesheet month.
	*
	* @param approvedBy the approved by of this timesheet month
	*/
	@Override
	public void setApprovedBy(java.lang.String approvedBy) {
		_timesheetMonth.setApprovedBy(approvedBy);
	}

	/**
	* Returns the approved date of this timesheet month.
	*
	* @return the approved date of this timesheet month
	*/
	@Override
	public java.util.Date getApprovedDate() {
		return _timesheetMonth.getApprovedDate();
	}

	/**
	* Sets the approved date of this timesheet month.
	*
	* @param approvedDate the approved date of this timesheet month
	*/
	@Override
	public void setApprovedDate(java.util.Date approvedDate) {
		_timesheetMonth.setApprovedDate(approvedDate);
	}

	/**
	* Returns the processed by of this timesheet month.
	*
	* @return the processed by of this timesheet month
	*/
	@Override
	public java.lang.String getProcessedBy() {
		return _timesheetMonth.getProcessedBy();
	}

	/**
	* Sets the processed by of this timesheet month.
	*
	* @param processedBy the processed by of this timesheet month
	*/
	@Override
	public void setProcessedBy(java.lang.String processedBy) {
		_timesheetMonth.setProcessedBy(processedBy);
	}

	/**
	* Returns the processed date of this timesheet month.
	*
	* @return the processed date of this timesheet month
	*/
	@Override
	public java.util.Date getProcessedDate() {
		return _timesheetMonth.getProcessedDate();
	}

	/**
	* Sets the processed date of this timesheet month.
	*
	* @param processedDate the processed date of this timesheet month
	*/
	@Override
	public void setProcessedDate(java.util.Date processedDate) {
		_timesheetMonth.setProcessedDate(processedDate);
	}

	@Override
	public boolean isNew() {
		return _timesheetMonth.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_timesheetMonth.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _timesheetMonth.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_timesheetMonth.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _timesheetMonth.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _timesheetMonth.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_timesheetMonth.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _timesheetMonth.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_timesheetMonth.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_timesheetMonth.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_timesheetMonth.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TimesheetMonthWrapper((TimesheetMonth)_timesheetMonth.clone());
	}

	@Override
	public int compareTo(
		sg.com.para.intranet.timesheet.services.model.TimesheetMonth timesheetMonth) {
		return _timesheetMonth.compareTo(timesheetMonth);
	}

	@Override
	public int hashCode() {
		return _timesheetMonth.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> toCacheModel() {
		return _timesheetMonth.toCacheModel();
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth toEscapedModel() {
		return new TimesheetMonthWrapper(_timesheetMonth.toEscapedModel());
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetMonth toUnescapedModel() {
		return new TimesheetMonthWrapper(_timesheetMonth.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _timesheetMonth.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _timesheetMonth.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_timesheetMonth.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimesheetMonthWrapper)) {
			return false;
		}

		TimesheetMonthWrapper timesheetMonthWrapper = (TimesheetMonthWrapper)obj;

		if (Validator.equals(_timesheetMonth,
					timesheetMonthWrapper._timesheetMonth)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TimesheetMonth getWrappedTimesheetMonth() {
		return _timesheetMonth;
	}

	@Override
	public TimesheetMonth getWrappedModel() {
		return _timesheetMonth;
	}

	@Override
	public void resetOriginalValues() {
		_timesheetMonth.resetOriginalValues();
	}

	private TimesheetMonth _timesheetMonth;
}