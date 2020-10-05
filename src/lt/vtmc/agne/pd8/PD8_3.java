package lt.vtmc.agne.pd8;

import java.util.Scanner;

public class PD8_3 {
	private static Scanner getData= new Scanner(System.in);
	private static int visuMoliuguSkaicius;
	private static int visuMoliuguSvoris;
	private static double moliugoSvoris;
	private static double tinkamiMoliugai;
	
	public static void main(String[] args) {
		moliuguSkaicius();
		atrinktiMoliugai();
		
		
	}
	
	private static void moliuguSkaicius() {
		System.out.println("Kiek moliūgų turite: ");
		visuMoliuguSkaicius = getData.nextInt();
	}
	
	private static void atrinktiMoliugai() {
		int suma = 0;
		System.out.println("Koks yra mažiausias priimamų moliūgų svoris: ");
		double minSvoris = getData.nextDouble();
		System.out.println("Koks yra didžiausias priimamų moliūgų svoris: ");
		double maxSvoris = getData.nextDouble();
		
		for (double i = 0; i < visuMoliuguSkaicius; ++i) {
			System.out.println("Iveskite moliugu svori: ");
			double moliugoSvoris = getData.nextDouble();
			visuMoliuguSvoris += moliugoSvoris;
			
			if(moliugoSvoris < maxSvoris & moliugoSvoris > minSvoris) {
				tinkamiMoliugai += moliugoSvoris;
			} 
		}
		System.out.println("Visu moliugu vidutinis svoris: " + (visuMoliuguSvoris / visuMoliuguSkaicius) + " kg");
		System.out.println("Tinkamu moliugu vidutinis svoris " + (tinkamiMoliugai / visuMoliuguSkaicius) + " kg");
	}
	
	
	
	
}