package lt.vtmc.agne.pd6;

import java.util.Scanner;

public class PD6_6 {

	private static Scanner dataInput= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Kiek žuvų gyvena akvariume?");
		int numberOfFishes = dataInput.nextInt();
		System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną?");
		int numberOfNewFishes = dataInput.nextInt();
		System.out.println("Kiek dienų praėjo?");
		int numberOfDays = dataInput.nextInt();
		
		int sum = numberOfFishes + (numberOfNewFishes * numberOfDays);
		System.out.println("Po " + numberOfDays + " dienų akvariume gyvens " + sum + " žuvų.");
	}

}
