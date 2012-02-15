package jenkins.plugins.build_metrics.stats;

import java.text.DecimalFormat;

public class StatsMath {

	public static double getPercent(double subVal, double totalVal){
		return roundTwoDecimals((totalVal == 0) ? 0.00 : (subVal / totalVal) * 100.00);
	}
	
	public static double roundTwoDecimals(double iVal){
		DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(iVal));
	}
}
