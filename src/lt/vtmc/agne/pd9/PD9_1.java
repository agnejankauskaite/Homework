package lt.vtmc.agne.pd9;

public class PD9_1 {

	public static void main(String[] args) {
		String string="Java for all";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.printf(reverse.replaceAll(" ",""));
	}

}
