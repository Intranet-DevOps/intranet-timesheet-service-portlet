create table intranet_attachment (
	attachmentId INTEGER not null primary key,
	entityType VARCHAR(75) null,
	entityId INTEGER,
	attachmentText VARCHAR(75) null
);

create table intranet_timesheet (
	timesheetId INTEGER not null primary key,
	employeeScreenName VARCHAR(75) null,
	logDate DATE null,
	regular DOUBLE,
	overtime DOUBLE,
	sick DOUBLE,
	vacation DOUBLE,
	holiday DOUBLE,
	unpaid DOUBLE,
	other DOUBLE,
	remarks VARCHAR(75) null,
	status VARCHAR(75) null,
	projectCode VARCHAR(75) null,
	approvedBy VARCHAR(75) null,
	approvedDate DATE null,
	processedBy VARCHAR(75) null,
	processedDate DATE null
);

create table intranet_timesheet_details (
	timesheetDetailsId INTEGER not null primary key,
	timesheetId INTEGER,
	clockInTime DATE null,
	clockOutTime DATE null,
	remarks VARCHAR(75) null,
	type_ VARCHAR(75) null,
	fulldayOrTimeBased VARCHAR(75) null
);

create table intranet_timesheet_month (
	timesheetMonthId INTEGER not null primary key,
	month INTEGER,
	year INTEGER,
	employeeScreenName VARCHAR(75) null,
	status VARCHAR(75) null,
	submittedDate DATE null,
	approvedBy VARCHAR(75) null,
	approvedDate DATE null,
	processedBy VARCHAR(75) null,
	processedDate DATE null
);