package sg.com.para.intranet.timsheet.services.util;

import java.text.DecimalFormat;

public class NumberUtils {

	public static double formatHourTwoDecimal(double d) {
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format(d));
	}
}
