package lt.vtmc.agne.pd8;

import java.math.BigInteger;

public class PD8_6 {

	public static void main(String[] args) {
		long number = 120L;
		long start = System.currentTimeMillis();
		System.out.println(getFibonacciNumber(number));
		System.out.println("Time: " + (System.currentTimeMillis() - start));
	}
		
		private static BigInteger getFibonacciNumber(long number){
		//BigInteger
			BigInteger a = BigInteger.valueOf(0);
			BigInteger b = BigInteger.valueOf(1);
			BigInteger c = BigInteger.valueOf(1);
			for(int i = 2; i <= number; i++) {
				c = a.add(b);
				a = b;
				b = c;
			}
			return c;
	}
}
