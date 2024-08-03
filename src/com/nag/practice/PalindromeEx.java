package interview.ques;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check palindrome: ");
		int num = sc.nextInt();
		sc.close();
		if(isPalindrome(num)) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number is not a palindrome");
		}
	}
	
	static boolean isPalindrome(int num) {
		boolean res=false;
		int r=0, sum= 0, temp=num;
		
		while(num > 0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		System.out.println(sum);
		
		if(temp == sum) {
			res = true;
		}
		return res;
	}

}
