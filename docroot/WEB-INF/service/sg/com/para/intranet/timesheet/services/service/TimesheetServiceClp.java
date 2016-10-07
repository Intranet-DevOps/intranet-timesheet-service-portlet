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

import com.liferay.portal.service.InvokableService;

/**
 * @author Fernando Karnagi
 * @generated
 */
public class TimesheetServiceClp implements TimesheetService {
	public TimesheetServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getTimesheet";

		_methodParameterTypes3 = new String[] { "int", "java.lang.String" };

		_methodName4 = "getTimesheetMonth";

		_methodParameterTypes4 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName5 = "findTimesheetsByUser";

		_methodParameterTypes5 = new String[] {
				"java.util.Date", "java.util.Date", "java.lang.String",
				"java.lang.String"
			};

		_methodName6 = "getTimesheetDetails";

		_methodParameterTypes6 = new String[] { "int", "java.lang.String" };

		_methodName7 = "addTimesheetDetails";

		_methodParameterTypes7 = new String[] {
				"int", "java.util.Date", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName8 = "deleteTimesheetDetails";

		_methodParameterTypes8 = new String[] { "int", "java.lang.String" };

		_methodName9 = "createTimeSheet";

		_methodParameterTypes9 = new String[] {
				"java.lang.String", "double", "double", "double", "double",
				"double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName10 = "updateTimeSheet";

		_methodParameterTypes10 = new String[] {
				"int", "java.lang.String", "double", "double", "double",
				"double", "double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName11 = "deleteTimeSheet";

		_methodParameterTypes11 = new String[] { "int", "java.lang.String" };

		_methodName12 = "approveTimeSheet";

		_methodParameterTypes12 = new String[] { "int", "java.lang.String" };

		_methodName13 = "rejectTimeSheet";

		_methodParameterTypes13 = new String[] {
				"int", "java.lang.String", "java.lang.String"
			};

		_methodName14 = "submitMonth";

		_methodParameterTypes14 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName15 = "rejectMonth";

		_methodParameterTypes15 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName16 = "approveMonth";

		_methodParameterTypes16 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet getTimesheet(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						timesheetId,
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (sg.com.para.intranet.timesheet.services.model.Timesheet)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth> getTimesheetMonth(
		int year, int month, java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] {
						year,
						
					month,
						
					ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetMonth>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.Timesheet> findTimesheetsByUser(
		java.util.Date startDate, java.util.Date endDate,
		java.lang.String userId, java.lang.String actor)
		throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] {
						ClpSerializer.translateInput(startDate),
						
					ClpSerializer.translateInput(endDate),
						
					ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<sg.com.para.intranet.timesheet.services.model.Timesheet>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetDetails> getTimesheetDetails(
		int timesheetId, java.lang.String actor) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] {
						timesheetId,
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<sg.com.para.intranet.timesheet.services.model.TimesheetDetails>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.TimesheetDetails addTimesheetDetails(
		int timesheetId, java.util.Date logDate, java.lang.String clockInTime,
		java.lang.String clockOutTime, java.lang.String type,
		java.lang.String remarks, java.lang.String fulldayOrTimeBased,
		java.lang.String actor) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] {
						timesheetId,
						
					ClpSerializer.translateInput(logDate),
						
					ClpSerializer.translateInput(clockInTime),
						
					ClpSerializer.translateInput(clockOutTime),
						
					ClpSerializer.translateInput(type),
						
					ClpSerializer.translateInput(remarks),
						
					ClpSerializer.translateInput(fulldayOrTimeBased),
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (sg.com.para.intranet.timesheet.services.model.TimesheetDetails)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteTimesheetDetails(int timesheetDetailsId,
		java.lang.String actor) throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName8,
				_methodParameterTypes8,
				new Object[] {
					timesheetDetailsId,
					
				ClpSerializer.translateInput(actor)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet createTimeSheet(
		java.lang.String employeeScreenName, double regular, double overtime,
		double sick, double vacation, double holiday, double unpaid,
		double other, java.lang.String remarks, java.lang.String status,
		java.lang.String projectCode, long logDate, java.lang.String actor)
		throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] {
						ClpSerializer.translateInput(employeeScreenName),
						
					regular,
						
					overtime,
						
					sick,
						
					vacation,
						
					holiday,
						
					unpaid,
						
					other,
						
					ClpSerializer.translateInput(remarks),
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(projectCode),
						
					logDate,
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (sg.com.para.intranet.timesheet.services.model.Timesheet)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public sg.com.para.intranet.timesheet.services.model.Timesheet updateTimeSheet(
		int timesheetId, java.lang.String employeeScreenName, double regular,
		double overtime, double sick, double vacation, double holiday,
		double unpaid, double other, java.lang.String remarks,
		java.lang.String status, java.lang.String projectCode, long logDate,
		java.lang.String actor) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] {
						timesheetId,
						
					ClpSerializer.translateInput(employeeScreenName),
						
					regular,
						
					overtime,
						
					sick,
						
					vacation,
						
					holiday,
						
					unpaid,
						
					other,
						
					ClpSerializer.translateInput(remarks),
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(projectCode),
						
					logDate,
						
					ClpSerializer.translateInput(actor)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (sg.com.para.intranet.timesheet.services.model.Timesheet)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName11,
				_methodParameterTypes11,
				new Object[] { timesheetId, ClpSerializer.translateInput(actor) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void approveTimeSheet(int timesheetId, java.lang.String actor)
		throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName12,
				_methodParameterTypes12,
				new Object[] { timesheetId, ClpSerializer.translateInput(actor) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void rejectTimeSheet(int timesheetId, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName13,
				_methodParameterTypes13,
				new Object[] {
					timesheetId,
					
				ClpSerializer.translateInput(comment),
					
				ClpSerializer.translateInput(actor)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void submitMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName14,
				_methodParameterTypes14,
				new Object[] {
					year,
					
				month,
					
				ClpSerializer.translateInput(userId),
					
				ClpSerializer.translateInput(actor)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void rejectMonth(int year, int month, java.lang.String comment,
		java.lang.String actor) throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName15,
				_methodParameterTypes15,
				new Object[] {
					year,
					
				month,
					
				ClpSerializer.translateInput(comment),
					
				ClpSerializer.translateInput(actor)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void approveMonth(int year, int month, java.lang.String userId,
		java.lang.String actor) throws java.lang.Exception {
		try {
			_invokableService.invokeMethod(_methodName16,
				_methodParameterTypes16,
				new Object[] {
					year,
					
				month,
					
				ClpSerializer.translateInput(userId),
					
				ClpSerializer.translateInput(actor)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
}