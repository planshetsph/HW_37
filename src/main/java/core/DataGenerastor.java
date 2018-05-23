package core;

import core.PrimeNumberChecker;

public class DataGenerastor {

	int length = 0, result = 0;
	static int max = 100;

	public static void main(String[] args) {
		int num = 0;
		for (int i = 2; i <= max; i++) {
			num++;
			String testNum = num < 10 ? "0" + String.valueOf(num) : String.valueOf(num);
			boolean isPrimeNumber = PrimeNumberChecker.validate(i);
			String primeNumberOrNot = isPrimeNumber ? " is prime number)," : " is not prime number),";
			String result = "TC-01." + testNum + "(" + i + primeNumberOrNot + i + "," + isPrimeNumber;
			System.out.println(result);
		}
	}
}
