// Logic:
/*
 * If we break it into steps, it will have the following steps. 
 * 1. compute products from each pair of digits from num1 and num2. 
 * 2. carry each element over. 
 * 3. output the solution.

	Things to note:
	The product of two numbers cannot exceed the sum of the two lengths. (e.g. 99 * 99 cannot be five digit)
 */

public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int[] products = new int[num1.length() + num2.length()];
        
        for(int i = num1.length()-1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';
            for (int j = num2.length()-1; j >= 0; j--) {
                int n2 = num2.charAt(j) - '0';
                products[i+j+1] += n1 * n2;
            }
        }
        
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = products.length-1; i >= 0; i--){
            int temp = (products[i] + carry) % 10;
            carry = (products[i] + carry) / 10;
            sb.append(String.valueOf(temp));
        }
        sb.reverse();
        if (sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.toString();
    }
}