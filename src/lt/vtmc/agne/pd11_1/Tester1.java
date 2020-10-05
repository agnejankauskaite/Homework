package lt.vtmc.agne.pd11_1;

import java.util.Arrays;

public class Tester1 {

	public static void main(String[] args) {
		Generator1 generate = new Generator1();
		generate.generateNumbers(5);
		System.out.println(Arrays.toString(generate.generateNumbers(5))); 
	}

}
