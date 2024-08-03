package interview.ques;

import java.util.Scanner;

public class PrimeEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();
		System.out.print("Enter the second number : ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		s.close();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		//System.out.println("sqrt("+n+"): "+Math.sqrt(n));
		for (int i = 2; i <= Math.sqrt(n); i++) {
			//System.out.println("i: "+i);s1
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
