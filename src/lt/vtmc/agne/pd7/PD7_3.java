package lt.vtmc.agne.pd7;

public class PD7_3 {

	public static void main(String[] args) {
	int i = 11;
	int fullDays = 112 / 33;
	int fuelRemaining = 112 % 33;
	
	if (fuelRemaining > 11) {
		System.out.println("Keliauti bus galima " + (fullDays * 2 + 1) + " dienas");
	} else {
		System.out.println("Keliauti bus galima " + (fullDays * 2 + 1));
	}
	}

}
