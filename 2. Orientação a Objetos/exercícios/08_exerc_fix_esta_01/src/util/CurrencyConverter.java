package util;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double Conversion(double quant, double cot) {
		return (quant * IOF + quant) * cot;
	}

}
