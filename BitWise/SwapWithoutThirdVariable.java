
public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		
		// Swapped numbers
		System.out.println(num1 + " " + num2);

	}

}
