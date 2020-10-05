package lt.vtmc.agne.pd11_1;

public class Generator1 {

	private int[] luckyNumbers;
	
	public int[] generateNumbers(int arraySize) {
		this.luckyNumbers = new int[arraySize];
		for (int i = 0; i< luckyNumbers.length; i++) {
			luckyNumbers[i] = (int)(Math.random() * 100);
		}
		return luckyNumbers; 
	}

}