package lt.vtmc.agne.pd6;

public class PD6_3 {

	private static int sienosPlotas = 400 * 300;
	private static int plytosPlotas = 20 * 10;
	private static double plytosKaina = 0.5;
	
	public static void main(String[] args) {
		
		int plytuKiekis = sienosPlotas / plytosPlotas;
		System.out.println("Reiks " + plytuKiekis + " plytų.");
		
		System.out.println("Plytos kainuos " + (plytuKiekis * plytosKaina) + " Eur");

}}
