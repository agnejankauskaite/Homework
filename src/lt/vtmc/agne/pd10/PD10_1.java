package lt.vtmc.agne.pd10;

import java.util.Arrays;

public class PD10_1 {

	public static void main(String[] args) {
		int[] numbers = new int[5000000];
		long startFill = System.currentTimeMillis();
		fillNumberArray(numbers);
		long startSort = System.currentTimeMillis();
		getSorted(numbers);
//		Arrays.sort(numbers);
		System.out.println("5000000 elementų masyvas buvo surūšiuotas per " + ((System.currentTimeMillis() - startSort) / 1000) + " sek.");
		
		}
	
	
	private static int[] fillNumberArray(int[] numbers) {
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		return numbers;
	}
	
	static int[] getSorted(int[] numbers) {
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