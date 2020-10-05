package lt.vtmc.agne.pd8;

public class PD8_4 {

	public static void main(String[] args) {
		int[] numbers = {2,5,8,4,2,3};
		int sum = 0;
		int average = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
			average = sum / numbers.length;
			
		}
		
		
		System.out.println("Masyvo elementų suma: " + sum);
		System.out.println("Masyvo elementų vidurkis: " + average);
		
	}

}
