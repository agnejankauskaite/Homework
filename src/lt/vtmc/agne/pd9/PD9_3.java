package lt.vtmc.agne.pd9;

import java.util.Arrays;

public class PD9_3 {

	public static void main(String[] args) {
		int [] numbers = {23,45,12,3,78,98,15,-3};
		System.out.println("Pradinis masyvas: "  + Arrays.toString(numbers).replace("[", "").replace("]", ""));

		System.out.print("Atrinktų skaičių masyvas: ");
		for(int i = 0; i < numbers.length; i++){  
			if(numbers [i] % 2 == 0){ 
				System.out.print(numbers[i] + " ");
			}
			} 
		 
		
		
		
	}

}
