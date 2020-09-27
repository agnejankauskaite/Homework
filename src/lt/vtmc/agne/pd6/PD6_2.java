package lt.vtmc.agne.pd6;

import java.util.Scanner;

public class PD6_2 {
	
	   private static Scanner dataInput= new Scanner(System.in);
	   private static int time = 45;
	   
		public static void main(String[] args) {

			int sum = getData("pirmadienį") + getData("antradienį")  + getData("trečiadienį") + getData("ketvirtadienį") + getData("penktadienį");
			System.out.println("Paskaitų skaičius per savaitę - " + sum);
			System.out.println("Tai sudaro " + (sum * time) + " minučių");
		}	
		
		public static int getData(String day) {
			System.out.println("Kiek paskaitų yra " + day + "?");
			int paskaituKiekis=  dataInput.nextInt();
			if (paskaituKiekis <= 0) {
				return 0;
			}
			return paskaituKiekis;
		}
		
			}
