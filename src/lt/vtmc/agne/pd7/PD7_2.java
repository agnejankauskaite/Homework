package lt.vtmc.agne.pd7;

import java.util.Scanner;

public class PD7_2 {
		
		private static int runnerNumber;
		private static Scanner getData= new Scanner(System.in);
		private static int fastRunnerTime = 1000;
		
		public static void main(String[] args) {
		getRunnerNumber();
//		System.out.println(runnerNumber);
		int result = getRunnerTimes();
		
		System.out.println("Greičiausias: " + fastRunnerTime + " greitesnis už vidurkį: " + (result/runnerNumber - fastRunnerTime));
		}
		
		

		public static int getRunnerTimes() {
			int timeSum = 0;
			for (int i = 0; i < runnerNumber; i++) {
				System.out.println("Iveskite laika: ");
				int runnerTime = getData.nextInt();
				if(runnerTime < fastRunnerTime) {
				fastRunnerTime = runnerTime;
			}	
				timeSum += runnerTime;
		}
//			System.out.println(timeSum);
			return timeSum;

		}
		
		private static void getRunnerNumber() {
			System.out.println("Kiek dalyvavo bėgikų: ");
			   runnerNumber = getData.nextInt();
		}
	}


