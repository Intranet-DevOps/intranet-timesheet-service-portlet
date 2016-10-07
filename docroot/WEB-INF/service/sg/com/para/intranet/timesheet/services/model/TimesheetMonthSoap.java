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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link sg.com.para.intranet.timesheet.services.service.http.TimesheetMonthServiceSoap}.
 *
 * @author Fernando Karnagi
 * @see sg.com.para.intranet.timesheet.services.service.http.TimesheetMonthServiceSoap
 * @generated
 */
public class TimesheetMonthSoap implements Serializable {
	public static TimesheetMonthSoap toSoapModel(TimesheetMonth model) {
		TimesheetMonthSoap soapModel = new TimesheetMonthSoap();

		soapModel.setTimesheetMonthId(model.getTimesheetMonthId());
		soapModel.setMonth(model.getMonth());
		soapModel.setYear(model.getYear());
		soapModel.setEmployeeScreenName(model.getEmployeeScreenName());
		soapModel.setStatus(model.getStatus());
		soapModel.setSubmittedDate(model.getSubmittedDate());
		soapModel.setApprovedBy(model.getApprovedBy());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setProcessedBy(model.getProcessedBy());
		soapModel.setProcessedDate(model.getProcessedDate());

		return soapModel;
	}

	public static TimesheetMonthSoap[] toSoapModels(TimesheetMonth[] models) {
		TimesheetMonthSoap[] soapModels = new TimesheetMonthSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TimesheetMonthSoap[][] toSoapModels(TimesheetMonth[][] models) {
		TimesheetMonthSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TimesheetMonthSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TimesheetMonthSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TimesheetMonthSoap[] toSoapModels(List<TimesheetMonth> models) {
		List<TimesheetMonthSoap> soapModels = new ArrayList<TimesheetMonthSoap>(models.size());

		for (TimesheetMonth model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TimesheetMonthSoap[soapModels.size()]);
	}

	public TimesheetMonthSoap() {
	}

	public int getPrimaryKey() {
		return _timesheetMonthId;
	}

	public void setPrimaryKey(int pk) {
		setTimesheetMonthId(pk);
	}

	public int getTimesheetMonthId() {
		return _timesheetMonthId;
	}

	public void setTimesheetMonthId(int timesheetMonthId) {
		_timesheetMonthId = timesheetMonthId;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public String getEmployeeScreenName() {
		return _employeeScreenName;
	}

	public void setEmployeeScreenName(String employeeScreenName) {
		_employeeScreenName = employeeScreenName;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public Date getSubmittedDate() {
		return _submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		_submittedDate = submittedDate;
	}

	public String getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public String getProcessedBy() {
		return _processedBy;
	}

	public void setProcessedBy(String processedBy) {
		_processedBy = processedBy;
	}

	public Date getProcessedDate() {
		return _processedDate;
	}

	public void setProcessedDate(Date processedDate) {
		_processedDate = processedDate;
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
}