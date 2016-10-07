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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.timesheet.services.service.ClpSerializer;
import sg.com.para.intranet.timesheet.services.service.TimesheetMonthLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Fernando Karnagi
 */
public class TimesheetMonthClp extends BaseModelImpl<TimesheetMonth>
	implements TimesheetMonth {
	public TimesheetMonthClp() {
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
	public int getPrimaryKey() {
		return _timesheetMonthId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTimesheetMonthId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timesheetMonthId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
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

	@Override
	public int getTimesheetMonthId() {
		return _timesheetMonthId;
	}

	@Override
	public void setTimesheetMonthId(int timesheetMonthId) {
		_timesheetMonthId = timesheetMonthId;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setTimesheetMonthId", int.class);

				method.invoke(_timesheetMonthRemoteModel, timesheetMonthId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getMonth() {
		return _month;
	}

	@Override
	public void setMonth(int month) {
		_month = month;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setMonth", int.class);

				method.invoke(_timesheetMonthRemoteModel, month);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setYear", int.class);

				method.invoke(_timesheetMonthRemoteModel, year);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	@Override
	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setEmployeeScreenName",
						String.class);

				method.invoke(_timesheetMonthRemoteModel, employeeScreenName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_timesheetMonthRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getSubmittedDate() {
		return _submittedDate;
	}

	@Override
	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setSubmittedDate", Date.class);

				method.invoke(_timesheetMonthRemoteModel, submittedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApprovedBy() {
		return _approvedBy;
	}

	@Override
	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedBy", String.class);

				method.invoke(_timesheetMonthRemoteModel, approvedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setApprovedDate", Date.class);

				method.invoke(_timesheetMonthRemoteModel, approvedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProcessedBy() {
		return _processedBy;
	}

	@Override
	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedBy", String.class);

				method.invoke(_timesheetMonthRemoteModel, processedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getProcessedDate() {
		return _processedDate;
	}

	@Override
	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;

		if (_timesheetMonthRemoteModel != null) {
			try {
				Class<?> clazz = _timesheetMonthRemoteModel.getClass();

				Method method = clazz.getMethod("setProcessedDate", Date.class);

				method.invoke(_timesheetMonthRemoteModel, processedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTimesheetMonthRemoteModel() {
		return _timesheetMonthRemoteModel;
	}

	public void setTimesheetMonthRemoteModel(
		BaseModel<?> timesheetMonthRemoteModel) {
		_timesheetMonthRemoteModel = timesheetMonthRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _timesheetMonthRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_timesheetMonthRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TimesheetMonthLocalServiceUtil.addTimesheetMonth(this);
		}
		else {
			TimesheetMonthLocalServiceUtil.updateTimesheetMonth(this);
		}
	}

	@Override
	public TimesheetMonth toEscapedModel() {
		return (TimesheetMonth)ProxyUtil.newProxyInstance(TimesheetMonth.class.getClassLoader(),
			new Class[] { TimesheetMonth.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TimesheetMonthClp clone = new TimesheetMonthClp();

		clone.setTimesheetMonthId(getTimesheetMonthId());
		clone.setMonth(getMonth());
		clone.setYear(getYear());
		clone.setEmployeeScreenName(getEmployeeScreenName());
		clone.setStatus(getStatus());
		clone.setSubmittedDate(getSubmittedDate());
		clone.setApprovedBy(getApprovedBy());
		clone.setApprovedDate(getApprovedDate());
		clone.setProcessedBy(getProcessedBy());
		clone.setProcessedDate(getProcessedDate());

		return clone;
	}

	@Override
	public int compareTo(TimesheetMonth timesheetMonth) {
		int primaryKey = timesheetMonth.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TimesheetMonthClp)) {
			return false;
		}

		TimesheetMonthClp timesheetMonth = (TimesheetMonthClp)obj;

		int primaryKey = timesheetMonth.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{timesheetMonthId=");
		sb.append(getTimesheetMonthId());
		sb.append(", month=");
		sb.append(getMonth());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", employeeScreenName=");
		sb.append(getEmployeeScreenName());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", submittedDate=");
		sb.append(getSubmittedDate());
		sb.append(", approvedBy=");
		sb.append(getApprovedBy());
		sb.append(", approvedDate=");
		sb.append(getApprovedDate());
		sb.append(", processedBy=");
		sb.append(getProcessedBy());
		sb.append(", processedDate=");
		sb.append(getProcessedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append(
			"sg.com.para.intranet.timesheet.services.model.TimesheetMonth");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetMonthId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetMonthId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>month</column-name><column-value><![CDATA[");
		sb.append(getMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeScreenName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>submittedDate</column-name><column-value><![CDATA[");
		sb.append(getSubmittedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedBy</column-name><column-value><![CDATA[");
		sb.append(getApprovedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approvedDate</column-name><column-value><![CDATA[");
		sb.append(getApprovedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedBy</column-name><column-value><![CDATA[");
		sb.append(getProcessedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processedDate</column-name><column-value><![CDATA[");
		sb.append(getProcessedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _timesheetMonthId;
	private int _month;
	private int _year;
	private String _employeeScreenName;
	private String _status;
	private Date _submittedDate;
	private String _approvedBy;
	private Date _approvedDate;
	private String _processedBy;
	private Date _processedDate;
	private BaseModel<?> _timesheetMonthRemoteModel;
	private Class<?> _clpSerializerClass = sg.com.para.intranet.timesheet.services.service.ClpSerializer.class;
}