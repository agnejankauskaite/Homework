package lt.vtmc.agne.pd8;

public class PD8_5 {
	
	public static void main(String[] args) {
		        int numbers[] = {2,5,-8,4,2,3};
		        int n = numbers.length; 

		        System.out.println("Mažiausias masyvo skaičius: " + findMinRec(numbers, n)); 
	}
	
	public static int findMinRec(int numbers[], int n) 
    { 
      if(n == 1) 
        return numbers[0]; 
          
        return Math.min(numbers[n-1], findMinRec(numbers, n-1)); 
    } 
}
	
	
	


