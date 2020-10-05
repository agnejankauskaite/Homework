package lt.vtmc.agne.pd9;

import java.util.Arrays;

public class PD9_4 {
	
		private static int[] firstArray = {23,45,12,3,78,98,15,-3};
		private static int[] secondArray = {2,12,24,15,48,64,-5,65};

		   public static void main(String[] args) { 
			   System.out.println("Pradinis masyvas Nr. 1: "  + Arrays.toString(firstArray).replace("[", "").replace("]", ""));
			   System.out.println("Pradinis masyvas Nr. 2: "  + Arrays.toString(secondArray).replace("[", "").replace("]", ""));
		        findMissing(secondArray, firstArray); 
		    } 
		

		static void findMissing( int[]  firstArray, int[] secondArray) { 
		System.out.print("Atrinktų skaičių masyvas: ");
		for (int i = 0; i < secondArray.length; i++) { 
		int j; 
		
		for (j = 0; j < firstArray.length; j++) 
		if (firstArray[i] ==  secondArray [j]) 
		break; 
		
		if (j == firstArray.length) 
		System.out.print(firstArray[i] + " "); 	
		}
		} 
		
	
}