package lt.vtmc.agne.pd10;

public class PD10_2 {
	public static void main(String[] args) {
		int[] numbers = new int[500000];
		long startFill = System.currentTimeMillis();
		fillNumberArray(numbers);
//		System.out.println("Time: " + (System.currentTimeMillis() - startFill));
		long startSort = System.currentTimeMillis();
		getSortedNumbers(numbers);
		System.out.println("5000000 elementų masyvas buvo surūšiuotas per " + ((System.currentTimeMillis() - startSort) / 1000) + " sek");

	}

	private static int[] getSortedNumbers(int[] numbers) {
			for(int i = 0; i < numbers.length; i++){
				int minArray = i;
				for (int j = i +1; j < numbers.length; j++) {
					if (numbers[minArray] > numbers [j]) {
						minArray = j;
					}
				}
				if(minArray != i) {
					int temp = numbers[i];
					numbers[i] = numbers[minArray];
					numbers[minArray] = temp;
				}
				
			}		
	return numbers;
	}
	
	

	static int[] fillNumberArray(int[] numbers) {
		int temp;
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			
		for(int i = 0; i < numbers.length -1; i++) {
			if (numbers[i] > numbers[i + 1]) {
				isSorted = false;
				temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
			}
		}
	}
		return numbers;
	
	}}
