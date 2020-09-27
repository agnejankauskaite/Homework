package lt.vtmc.agne.pd7;

import java.util.Scanner;

public class PD7_1 {

	private static Scanner dataInput= new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Kiek eglučių atvežta?");
		int numberOfTrees = dataInput.nextInt();
		double average = getData("1") + getData("2") + getData("3") + getData("4") + getData("5") + getData("6");
		System.out.println("Eglutės aukščio vidurkis: " + (average / numberOfTrees) + " cm");
	}
	
	public static int getData(String trees) {
		System.out.println("Įveskite " + trees + " eglutės aukštį (cm): ");
		int treeHeight=  dataInput.nextInt();
		
		return treeHeight;
	}

}
