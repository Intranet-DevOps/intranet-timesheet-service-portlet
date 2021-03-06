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

package sg.com.para.intranet.timesheet.services.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.timesheet.services.model.Timesheet;
import sg.com.para.intranet.timesheet.services.model.TimesheetModel;
import sg.com.para.intranet.timesheet.services.model.TimesheetSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Timesheet service. Represents a row in the &quot;intranet_timesheet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link sg.com.para.intranet.timesheet.services.model.TimesheetModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TimesheetImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see TimesheetImpl
 * @see sg.com.para.intranet.timesheet.services.model.Timesheet
 * @see sg.com.para.intranet.timesheet.services.model.TimesheetModel
 * @generated
 */
@JSON(strict = true)
public class TimesheetModelImpl extends BaseModelImpl<Timesheet>
	implements TimesheetModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a timesheet model instance should use the {@link sg.com.para.intranet.timesheet.services.model.Timesheet} interface instead.
	 */
	public static final String TABLE_NAME = "intranet_timesheet";
	public static final Object[][] TABLE_COLUMNS = {
			{ "timesheetId", Types.INTEGER },
			{ "employeeScreenName", Types.VARCHAR },
			{ "logDate", Types.TIMESTAMP },
			{ "regular", Types.DOUBLE },
			{ "overtime", Types.DOUBLE },
			{ "sick", Types.DOUBLE },
			{ "vacation", Types.DOUBLE },
			{ "holiday", Types.DOUBLE },
			{ "unpaid", Types.DOUBLE },
			{ "other", Types.DOUBLE },
			{ "remarks", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "projectCode", Types.VARCHAR },
			{ "approvedBy", Types.VARCHAR },
			{ "approvedDate", Types.TIMESTAMP },
			{ "processedBy", Types.VARCHAR },
			{ "processedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table intranet_timesheet (timesheetId INTEGER not null primary key,employeeScreenName VARCHAR(75) null,logDate DATE null,regular DOUBLE,overtime DOUBLE,sick DOUBLE,vacation DOUBLE,holiday DOUBLE,unpaid DOUBLE,other DOUBLE,remarks VARCHAR(75) null,status VARCHAR(75) null,projectCode VARCHAR(75) null,approvedBy VARCHAR(75) null,approvedDate DATE null,processedBy VARCHAR(75) null,processedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table intranet_timesheet";
	public static final String ORDER_BY_JPQL = " ORDER BY timesheet.timesheetId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY intranet_timesheet.timesheetId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.sg.com.para.intranet.timesheet.services.model.Timesheet"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.sg.com.para.intranet.timesheet.services.model.Timesheet"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Timesheet toModel(TimesheetSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Timesheet model = new TimesheetImpl();

		model.setTimesheetId(soapModel.getTimesheetId());
		model.setEmployeeScreenName(soapModel.getEmployeeScreenName());
		model.setLogDate(soapModel.getLogDate());
		model.setRegular(soapModel.getRegular());
		model.setOvertime(soapModel.getOvertime());
		model.setSick(soapModel.getSick());
		model.setVacation(soapModel.getVacation());
		model.setHoliday(soapModel.getHoliday());
		model.setUnpaid(soapModel.getUnpaid());
		model.setOther(soapModel.getOther());
		model.setRemarks(soapModel.getRemarks());
		model.setStatus(soapModel.getStatus());
		model.setProjectCode(soapModel.getProjectCode());
		model.setApprovedBy(soapModel.getApprovedBy());
		model.setApprovedDate(soapModel.getApprovedDate());
		model.setProcessedBy(soapModel.getProcessedBy());
		model.setProcessedDate(soapModel.getProcessedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Timesheet> toModels(TimesheetSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Timesheet> models = new ArrayList<Timesheet>(soapModels.length);

		for (TimesheetSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.sg.com.para.intranet.timesheet.services.model.Timesheet"));

	public TimesheetModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setTimesheetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _timesheetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Timesheet.class;
	}

	@Override
	public String getModelClassName() {
		return Timesheet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("timesheetId", getTimesheetId());
		attributes.put("employeeScreenName", getEmployeeScreenName());
		attributes.put("logDate", getLogDate());
		attributes.put("regular", getRegular());
		attributes.put("overtime", getOvertime());
		attributes.put("sick", getSick());
		attributes.put("vacation", getVacation());
		attributes.put("holiday", getHoliday());
		attributes.put("unpaid", getUnpaid());
		attributes.put("other", getOther());
		attributes.put("remarks", getRemarks());
		attributes.put("status", getStatus());
		attributes.put("projectCode", getProjectCode());
		attributes.put("approvedBy", getApprovedBy());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("processedBy", getProcessedBy());
		attributes.put("processedDate", getProcessedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer timesheetId = (Integer)attributes.get("timesheetId");

		if (timesheetId != null) {
			setTimesheetId(timesheetId);
		}

		String employeeScreenName = (String)attributes.get("employeeScreenName");

		if (employeeScreenName != null) {
			setEmployeeScreenName(employeeScreenName);
		}

		Date logDate = (Date)attributes.get("logDate");

		if (logDate != null) {
			setLogDate(logDate);
		}

		Double regular = (Double)attributes.get("regular");

		if (regular != null) {
			setRegular(regular);
		}

		Double overtime = (Double)attributes.get("overtime");

		if (overtime != null) {
			setOvertime(overtime);
		}

		Double sick = (Double)attributes.get("sick");

		if (sick != null) {
			setSick(sick);
		}

		Double vacation = (Double)attributes.get("vacation");

		if (vacation != null) {
			setVacation(vacation);
		}

		Double holiday = (Double)attributes.get("holiday");

		if (holiday != null) {
			setHoliday(holiday);
		}

		Double unpaid = (Double)attributes.get("unpaid");

		if (unpaid != null) {
			setUnpaid(unpaid);
		}

		Double other = (Double)attributes.get("other");

		if (other != null) {
			setOther(other);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String projectCode = (String)attributes.get("projectCode");

		if (projectCode != null) {
			setProjectCode(projectCode);
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

	@JSON
	@Override
	public int getTimesheetId() {
		return _timesheetId;
	}

	@Override
	public void setTimesheetId(int timesheetId) {
		_timesheetId = timesheetId;
	}

	@JSON
	@Override
	public String getEmployeeScreenName() {
		if (_employeeScreenName == null) {
			return StringPool.BLANK;
		}
		else {
			return _employeeScreenName;
		}
	}

	@Override
	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;
	}

	@JSON
	@Override
	public Date getLogDate() {
		return _logDate;
	}

	@Override
	public void setLogDate(Date logDate) {
		_logDate = logDate;
	}

	@JSON
	@Override
	public double getRegular() {
		return _regular;
	}

	@Override
	public void setRegular(double regular) {
		_regular = regular;
	}

	@JSON
	@Override
	public double getOvertime() {
		return _overtime;
	}

	@Override
	public void setOvertime(double overtime) {
		_overtime = overtime;
	}

	@JSON
	@Override
	public double getSick() {
		return _sick;
	}

	@Override
	public void setSick(double sick) {
		_sick = sick;
	}

	@JSON
	@Override
	public double getVacation() {
		return _vacation;
	}

	@Override
	public void setVacation(double vacation) {
		_vacation = vacation;
	}

	@JSON
	@Override
	public double getHoliday() {
		return _holiday;
	}

	@Override
	public void setHoliday(double holiday) {
		_holiday = holiday;
	}

	@JSON
	@Override
	public double getUnpaid() {
		return _unpaid;
	}

	@Override
	public void setUnpaid(double unpaid) {
		_unpaid = unpaid;
	}

	@JSON
	@Override
	public double getOther() {
		return _other;
	}

	@Override
	public void setOther(double other) {
		_other = other;
	}

	@JSON
	@Override
	public String getRemarks() {
		if (_remarks == null) {
			return StringPool.BLANK;
		}
		else {
			return _remarks;
		}
	}

	@Override
	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@JSON
	@Override
	public String getProjectCode() {
		if (_projectCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectCode;
		}
	}

	@Override
	public void setProjectCode(String projectCode) {
		_projectCode = projectCode;
	}

	@JSON
	@Override
	public String getApprovedBy() {
		if (_approvedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _approvedBy;
		}
	}

	@Override
	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;
	}

	@JSON
	@Override
	public Date getApprovedDate() {
		return _approvedDate;
	}

	@Override
	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	@JSON
	@Override
	public String getProcessedBy() {
		if (_processedBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _processedBy;
		}
	}

	@Override
	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;
	}

	@JSON
	@Override
	public Date getProcessedDate() {
		return _processedDate;
	}

	@Override
	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;
	}

	@Override
	public Timesheet toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Timesheet)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TimesheetImpl timesheetImpl = new TimesheetImpl();

		timesheetImpl.setTimesheetId(getTimesheetId());
		timesheetImpl.setEmployeeScreenName(getEmployeeScreenName());
		timesheetImpl.setLogDate(getLogDate());
		timesheetImpl.setRegular(getRegular());
		timesheetImpl.setOvertime(getOvertime());
		timesheetImpl.setSick(getSick());
		timesheetImpl.setVacation(getVacation());
		timesheetImpl.setHoliday(getHoliday());
		timesheetImpl.setUnpaid(getUnpaid());
		timesheetImpl.setOther(getOther());
		timesheetImpl.setRemarks(getRemarks());
		timesheetImpl.setStatus(getStatus());
		timesheetImpl.setProjectCode(getProjectCode());
		timesheetImpl.setApprovedBy(getApprovedBy());
		timesheetImpl.setApprovedDate(getApprovedDate());
		timesheetImpl.setProcessedBy(getProcessedBy());
		timesheetImpl.setProcessedDate(getProcessedDate());

		timesheetImpl.resetOriginalValues();

		return timesheetImpl;
	}

	@Override
	public int compareTo(Timesheet timesheet) {
		int primaryKey = timesheet.getPrimaryKey();

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

		if (!(obj instanceof Timesheet)) {
			return false;
		}

		Timesheet timesheet = (Timesheet)obj;

		int primaryKey = timesheet.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Timesheet> toCacheModel() {
		TimesheetCacheModel timesheetCacheModel = new TimesheetCacheModel();

		timesheetCacheModel.timesheetId = getTimesheetId();

		timesheetCacheModel.employeeScreenName = getEmployeeScreenName();

		String employeeScreenName = timesheetCacheModel.employeeScreenName;

		if ((employeeScreenName != null) && (employeeScreenName.length() == 0)) {
			timesheetCacheModel.employeeScreenName = null;
		}

		Date logDate = getLogDate();

		if (logDate != null) {
			timesheetCacheModel.logDate = logDate.getTime();
		}
		else {
			timesheetCacheModel.logDate = Long.MIN_VALUE;
		}

		timesheetCacheModel.regular = getRegular();

		timesheetCacheModel.overtime = getOvertime();

		timesheetCacheModel.sick = getSick();

		timesheetCacheModel.vacation = getVacation();

		timesheetCacheModel.holiday = getHoliday();

		timesheetCacheModel.unpaid = getUnpaid();

		timesheetCacheModel.other = getOther();

		timesheetCacheModel.remarks = getRemarks();

		String remarks = timesheetCacheModel.remarks;

		if ((remarks != null) && (remarks.length() == 0)) {
			timesheetCacheModel.remarks = null;
		}

		timesheetCacheModel.status = getStatus();

		String status = timesheetCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			timesheetCacheModel.status = null;
		}

		timesheetCacheModel.projectCode = getProjectCode();

		String projectCode = timesheetCacheModel.projectCode;

		if ((projectCode != null) && (projectCode.length() == 0)) {
			timesheetCacheModel.projectCode = null;
		}

		timesheetCacheModel.approvedBy = getApprovedBy();

		String approvedBy = timesheetCacheModel.approvedBy;

		if ((approvedBy != null) && (approvedBy.length() == 0)) {
			timesheetCacheModel.approvedBy = null;
		}

		Date approvedDate = getApprovedDate();

		if (approvedDate != null) {
			timesheetCacheModel.approvedDate = approvedDate.getTime();
		}
		else {
			timesheetCacheModel.approvedDate = Long.MIN_VALUE;
		}

		timesheetCacheModel.processedBy = getProcessedBy();

		String processedBy = timesheetCacheModel.processedBy;

		if ((processedBy != null) && (processedBy.length() == 0)) {
			timesheetCacheModel.processedBy = null;
		}

		Date processedDate = getProcessedDate();

		if (processedDate != null) {
			timesheetCacheModel.processedDate = processedDate.getTime();
		}
		else {
			timesheetCacheModel.processedDate = Long.MIN_VALUE;
		}

		return timesheetCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{timesheetId=");
		sb.append(getTimesheetId());
		sb.append(", employeeScreenName=");
		sb.append(getEmployeeScreenName());
		sb.append(", logDate=");
		sb.append(getLogDate());
		sb.append(", regular=");
		sb.append(getRegular());
		sb.append(", overtime=");
		sb.append(getOvertime());
		sb.append(", sick=");
		sb.append(getSick());
		sb.append(", vacation=");
		sb.append(getVacation());
		sb.append(", holiday=");
		sb.append(getHoliday());
		sb.append(", unpaid=");
		sb.append(getUnpaid());
		sb.append(", other=");
		sb.append(getOther());
		sb.append(", remarks=");
		sb.append(getRemarks());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", projectCode=");
		sb.append(getProjectCode());
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
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.timesheet.services.model.Timesheet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>timesheetId</column-name><column-value><![CDATA[");
		sb.append(getTimesheetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>employeeScreenName</column-name><column-value><![CDATA[");
		sb.append(getEmployeeScreenName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logDate</column-name><column-value><![CDATA[");
		sb.append(getLogDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regular</column-name><column-value><![CDATA[");
		sb.append(getRegular());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>overtime</column-name><column-value><![CDATA[");
		sb.append(getOvertime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sick</column-name><column-value><![CDATA[");
		sb.append(getSick());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vacation</column-name><column-value><![CDATA[");
		sb.append(getVacation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>holiday</column-name><column-value><![CDATA[");
		sb.append(getHoliday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unpaid</column-name><column-value><![CDATA[");
		sb.append(getUnpaid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>other</column-name><column-value><![CDATA[");
		sb.append(getOther());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remarks</column-name><column-value><![CDATA[");
		sb.append(getRemarks());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectCode</column-name><column-value><![CDATA[");
		sb.append(getProjectCode());
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

	private static ClassLoader _classLoader = Timesheet.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Timesheet.class
		};
	private int _timesheetId;
	private String _employeeScreenName;
	private Date _logDate;
	private double _regular;
	private double _overtime;
	private double _sick;
	private double _vacation;
	private double _holiday;
	private double _unpaid;
	private double _other;
	private String _remarks;
	private String _status;
	private String _projectCode;
	private String _approvedBy;
	private Date _approvedDate;
	private String _processedBy;
	private Date _processedDate;
	private Timesheet _escapedModel;
}