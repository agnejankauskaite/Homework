package lt.vtmc.agne.pd6;

public class PD6_5 {

	private static double tunnelLength = 0.264;
	private static int carSpeed = 60;
	
	public static void main(String[] args) {
		double time = tunnelLength / carSpeed * 3600;
		String timeRounded = String.format("%.2f", time);
		System.out.printf("Automobilis tunelį pravažiuos per " + timeRounded + " s");

	}

}
