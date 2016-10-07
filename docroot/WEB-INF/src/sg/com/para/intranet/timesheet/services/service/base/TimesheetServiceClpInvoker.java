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

import sg.com.para.intranet.timesheet.services.service.TimesheetServiceUtil;

import java.util.Arrays;

/**
 * @author Fernando Karnagi
 * @generated
 */
public class TimesheetServiceClpInvoker {
	public TimesheetServiceClpInvoker() {
		_methodName30 = "getBeanIdentifier";

		_methodParameterTypes30 = new String[] {  };

		_methodName31 = "setBeanIdentifier";

		_methodParameterTypes31 = new String[] { "java.lang.String" };

		_methodName36 = "getTimesheet";

		_methodParameterTypes36 = new String[] { "int", "java.lang.String" };

		_methodName38 = "getTimesheetMonth";

		_methodParameterTypes38 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName39 = "findTimesheetsByUser";

		_methodParameterTypes39 = new String[] {
				"java.util.Date", "java.util.Date", "java.lang.String",
				"java.lang.String"
			};

		_methodName40 = "getTimesheetDetails";

		_methodParameterTypes40 = new String[] { "int", "java.lang.String" };

		_methodName41 = "addTimesheetDetails";

		_methodParameterTypes41 = new String[] {
				"int", "java.util.Date", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String"
			};

		_methodName42 = "deleteTimesheetDetails";

		_methodParameterTypes42 = new String[] { "int", "java.lang.String" };

		_methodName43 = "createTimeSheet";

		_methodParameterTypes43 = new String[] {
				"java.lang.String", "double", "double", "double", "double",
				"double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName44 = "updateTimeSheet";

		_methodParameterTypes44 = new String[] {
				"int", "java.lang.String", "double", "double", "double",
				"double", "double", "double", "double", "java.lang.String",
				"java.lang.String", "java.lang.String", "long",
				"java.lang.String"
			};

		_methodName45 = "deleteTimeSheet";

		_methodParameterTypes45 = new String[] { "int", "java.lang.String" };

		_methodName46 = "approveTimeSheet";

		_methodParameterTypes46 = new String[] { "int", "java.lang.String" };

		_methodName47 = "rejectTimeSheet";

		_methodParameterTypes47 = new String[] {
				"int", "java.lang.String", "java.lang.String"
			};

		_methodName48 = "submitMonth";

		_methodParameterTypes48 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName49 = "rejectMonth";

		_methodParameterTypes49 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};

		_methodName50 = "approveMonth";

		_methodParameterTypes50 = new String[] {
				"int", "int", "java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return TimesheetServiceUtil.getBeanIdentifier();
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			TimesheetServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return TimesheetServiceUtil.getTimesheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			return TimesheetServiceUtil.getTimesheetMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			return TimesheetServiceUtil.findTimesheetsByUser((java.util.Date)arguments[0],
				(java.util.Date)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return TimesheetServiceUtil.getTimesheetDetails(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
			return TimesheetServiceUtil.addTimesheetDetails(((Integer)arguments[0]).intValue(),
				(java.util.Date)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			TimesheetServiceUtil.deleteTimesheetDetails(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return TimesheetServiceUtil.createTimeSheet((java.lang.String)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Double)arguments[2]).doubleValue(),
				((Double)arguments[3]).doubleValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				(java.lang.String)arguments[8], (java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				((Long)arguments[11]).longValue(),
				(java.lang.String)arguments[12]);
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
			return TimesheetServiceUtil.updateTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1],
				((Double)arguments[2]).doubleValue(),
				((Double)arguments[3]).doubleValue(),
				((Double)arguments[4]).doubleValue(),
				((Double)arguments[5]).doubleValue(),
				((Double)arguments[6]).doubleValue(),
				((Double)arguments[7]).doubleValue(),
				((Double)arguments[8]).doubleValue(),
				(java.lang.String)arguments[9],
				(java.lang.String)arguments[10],
				(java.lang.String)arguments[11],
				((Long)arguments[12]).longValue(),
				(java.lang.String)arguments[13]);
		}

		if (_methodName45.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
			TimesheetServiceUtil.deleteTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			TimesheetServiceUtil.approveTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			TimesheetServiceUtil.rejectTimeSheet(((Integer)arguments[0]).intValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);

			return null;
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			TimesheetServiceUtil.submitMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
			TimesheetServiceUtil.rejectMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			TimesheetServiceUtil.approveMonth(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
}