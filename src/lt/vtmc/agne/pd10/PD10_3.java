package lt.vtmc.agne.pd10;

public class PD10_3 {

	public static void main(String[] args) {
		int[] numbers = new int[100000];
		long startFill = System.currentTimeMillis();
		fillNumberArray(numbers);
		long startSort = System.currentTimeMillis();
		getSorted(numbers);
		System.out.println("5000000 elementų masyvas buvo surūšiuotas per " + ((System.currentTimeMillis() - startSort) / 1000) + " sek.");
		
		}
	
	
	private static int[] fillNumberArray(int[] numbers) {
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}
	
	static int[] getSorted(int[] numbers) {
		for (int  i = 0; i < numbers.length; i++) {
			int key = numbers[i];
			int j = i - 1 ;  
			while(j >= 0 && numbers[j] > key) {
					numbers[j + 1] = numbers[j];
					j = j - 1;		
			}
			numbers[j + 1] = key;
			
		}
		return numbers;
	}
}