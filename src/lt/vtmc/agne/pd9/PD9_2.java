package lt.vtmc.agne.pd9;

public class PD9_2 {
	public static double totalSausis;
	public static double totalVasaris;
	public static double totalKovas;
	
	public static double[] sausis =  {-11.5, -10.3, -12, -6.5, -5, -15.5};
	public static double[] vasaris = {-16, -14.5, -11, -10.3, -3.5, 0};
	public static double[] kovas = {-3, -2.5, 0, 5, 9.5, 11.2};
			
	public static void main(String[] args) {
		getAverageOfSausis(); 
		getAverageOfVasaris(); 
		getAverageOfKovas();
		
	}

	private static void getAverageOfSausis() {
		for (int i= 0 ; i < sausis.length; i++) {
				totalSausis = totalSausis + sausis[i];
			}
			double averageSausis = totalSausis / sausis.length;
			System.out.println("Vidutinė sausio temperatūra: " + averageSausis);
	}
	
	private static void getAverageOfVasaris() {
		for (int i= 0 ; i < sausis.length; i++) {
				totalVasaris = totalVasaris + vasaris[i];
			}
			double averageVasaris = totalVasaris / vasaris.length;
			System.out.println("Vidutinė vasario temperatūra: " + averageVasaris);
	}
	
	private static void getAverageOfKovas() {
		for (int i= 0 ; i < kovas.length; i++) {
				totalKovas = totalKovas + kovas[i];
			}
			double averageKovas = totalKovas / kovas.length;
			System.out.println("Vidutinė kovo temperatūra: " + averageKovas);
	}
}
