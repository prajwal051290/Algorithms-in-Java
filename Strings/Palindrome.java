package stringsQuiz;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(String input){
	
		int low = 0;
		int high = input.length()-1;
		
		while (low < high){
			
			if (input.charAt(low++) != input.charAt(high--))
				return false;
			
		}
		
		return true;
	
	}
	
	static boolean isPalRec(String s){
		
		boolean a;
		
		if (s.length() == 1)
			return true;
		
		if (s.charAt(0) == s.charAt(s.length()-1)){
			a= isPalRec(s.substring(1,s.length()-1));
			return a;
		}
		
		return false;
		
	}

	public static void main(String[] args){

		boolean palindromeResult;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Palindrome without recursion");
		System.out.println("Please enter a string");
		String s = sc.nextLine();
		palindromeResult = Palindrome.isPalindrome(s);
		
		if (palindromeResult)
			System.out.println("Input string is palindrome");
		else
			System.out.println("Input string is not palindrome");
		
		
		System.out.println("\nPalindrome with recursion");
		System.out.println("Please enter a string");
		s = sc.nextLine();
		palindromeResult = Palindrome.isPalRec(s);
		
		if (palindromeResult)
			System.out.println("Input string is palindrome");
		else
			System.out.println("Input string is not palindrome");
		
	}
	
}
