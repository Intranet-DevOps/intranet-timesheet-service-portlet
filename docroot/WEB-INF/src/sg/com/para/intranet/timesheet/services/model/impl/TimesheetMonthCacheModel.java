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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import sg.com.para.intranet.timesheet.services.model.TimesheetMonth;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TimesheetMonth in entity cache.
 *
 * @author Fernando Karnagi
 * @see TimesheetMonth
 * @generated
 */
public class TimesheetMonthCacheModel implements CacheModel<TimesheetMonth>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{timesheetMonthId=");
		sb.append(timesheetMonthId);
		sb.append(", month=");
		sb.append(month);
		sb.append(", year=");
		sb.append(year);
		sb.append(", employeeScreenName=");
		sb.append(employeeScreenName);
		sb.append(", status=");
		sb.append(status);
		sb.append(", submittedDate=");
		sb.append(submittedDate);
		sb.append(", approvedBy=");
		sb.append(approvedBy);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", processedBy=");
		sb.append(processedBy);
		sb.append(", processedDate=");
		sb.append(processedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TimesheetMonth toEntityModel() {
		TimesheetMonthImpl timesheetMonthImpl = new TimesheetMonthImpl();

		timesheetMonthImpl.setTimesheetMonthId(timesheetMonthId);
		timesheetMonthImpl.setMonth(month);
		timesheetMonthImpl.setYear(year);

		if (employeeScreenName == null) {
			timesheetMonthImpl.setEmployeeScreenName(StringPool.BLANK);
		}
		else {
			timesheetMonthImpl.setEmployeeScreenName(employeeScreenName);
		}

		if (status == null) {
			timesheetMonthImpl.setStatus(StringPool.BLANK);
		}
		else {
			timesheetMonthImpl.setStatus(status);
		}

		if (submittedDate == Long.MIN_VALUE) {
			timesheetMonthImpl.setSubmittedDate(null);
		}
		else {
			timesheetMonthImpl.setSubmittedDate(new Date(submittedDate));
		}

		if (approvedBy == null) {
			timesheetMonthImpl.setApprovedBy(StringPool.BLANK);
		}
		else {
			timesheetMonthImpl.setApprovedBy(approvedBy);
		}

		if (approvedDate == Long.MIN_VALUE) {
			timesheetMonthImpl.setApprovedDate(null);
		}
		else {
			timesheetMonthImpl.setApprovedDate(new Date(approvedDate));
		}

		if (processedBy == null) {
			timesheetMonthImpl.setProcessedBy(StringPool.BLANK);
		}
		else {
			timesheetMonthImpl.setProcessedBy(processedBy);
		}

		if (processedDate == Long.MIN_VALUE) {
			timesheetMonthImpl.setProcessedDate(null);
		}
		else {
			timesheetMonthImpl.setProcessedDate(new Date(processedDate));
		}

		timesheetMonthImpl.resetOriginalValues();

		return timesheetMonthImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		timesheetMonthId = objectInput.readInt();
		month = objectInput.readInt();
		year = objectInput.readInt();
		employeeScreenName = objectInput.readUTF();
		status = objectInput.readUTF();
		submittedDate = objectInput.readLong();
		approvedBy = objectInput.readUTF();
		approvedDate = objectInput.readLong();
		processedBy = objectInput.readUTF();
		processedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(timesheetMonthId);
		objectOutput.writeInt(month);
		objectOutput.writeInt(year);

		if (employeeScreenName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeScreenName);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(submittedDate);

		if (approvedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvedBy);
		}

		objectOutput.writeLong(approvedDate);

		if (processedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(processedBy);
		}

		objectOutput.writeLong(processedDate);
	}

	public int timesheetMonthId;
	public int month;
	public int year;
	public String employeeScreenName;
	public String status;
	public long submittedDate;
	public String approvedBy;
	public long approvedDate;
	public String processedBy;
	public long processedDate;
}