package lt.vtmc.agne.pd8;

import java.util.Arrays;

public class PD8_1 {

	public static void main(String[] args) {
		double[] prices = new double[]{102.56, 215.72, 99.21, 200, 175.99, 214.99};
		double sum = Arrays.stream(prices).sum();
		double average = sum / prices.length;
		
		System.out.printf("%s%1.2f%s%n", "Vidutiniškai viena prekė kainavo ", average, " Eur");
		System.out.println("Per dieną pardavė prekių už " + sum + " Eur");
	}

}
