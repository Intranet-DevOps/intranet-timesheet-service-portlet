package sg.com.para.intranet.timsheet.services.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static boolean isSameDate(Date d1, Date d2) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(d1);
		cal2.setTime(d2);
		cal1.set(Calendar.HOUR, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);
		cal2.set(Calendar.HOUR, 0);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.SECOND, 0);
		cal2.set(Calendar.MILLISECOND, 0);
		return cal1.equals(cal2);
	}

	public static Date increaseDay(Date d1, int numOfDays) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		cal1.add(Calendar.DATE, numOfDays);
		return cal1.getTime();
	}

	public static double hourDiff(Date d1, Date d2) {
		double ret = 0;
		double diff = d2.getTime() - d1.getTime();
		ret = diff / 3600000;
		return ret;
	}

	public static Date getStartOfMonth(int year, int month) {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DATE, 1);
		date.set(Calendar.HOUR, 0);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		return date.getTime();
	}

	public static Date getEndOfMonth(int year, int month) {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month + 1);
		date.set(Calendar.DATE, 1);
		date.set(Calendar.HOUR, 0);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		date.add(Calendar.DATE, -1);
		return date.getTime();
	}
}
