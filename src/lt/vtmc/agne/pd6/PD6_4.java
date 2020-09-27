package lt.vtmc.agne.pd6;

public class PD6_4 {

	private static int puodeliuDezeje = 3;
	private static int puodeliuSkaicius = 7;
	
	public static void main(String[] args) {

		int dezes = puodeliuSkaicius / puodeliuDezeje;
		int liekana = puodeliuSkaicius % puodeliuDezeje;
		System.out.println("Pilnų dėžučių skaičius: " + dezes);
		System.out.println("Nesupakuotų puodelių liks: " + liekana);
		

	}

}
