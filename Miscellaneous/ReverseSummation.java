package general;

import java.util.Scanner;

/*
 * This program reverses 2 input numbers and adds them. The final addition is reversed as well.
 * Thus, it is effectively addition of original 2 numbers.
 */

public class ReverseSummation {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = sc.nextInt();
		
		int reverseSummation = reverseSumIntegers (num1,num2);
		
		System.out.println("Reversed Summation is: " + reverseSummation);
		
	}
	
	
	static int reverseSumIntegers(int input1, int input2) {

        return reverse(reverse(input1) + reverse(input2));

    }

    static int reverse(int no) {
	
        int newNo = 0;

	    while (no > 0) {
		  newNo = newNo*10+(no%10);
		  no = no/10;
	   }

	   return newNo;
        
    }
	
}
