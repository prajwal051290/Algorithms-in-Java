// Logic:
/*
 * This is done brute force way - O(n^2)
 * Normal multiplication process is translated to code.
 * This can be improved.
 * 
 * Submitting this on leetcode gives error: Line 32: java.lang.NumberFormatException: For input string: "8888888889"
 * 
 */

public class Solution {
    public String multiply(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum = 0;
        int carry = 0;
        int zeroCount = 0;
        
        if (i < 0 || j < 0)
            return "0";
        
        for(; i >= 0; i--){
            int n1 = Character.getNumericValue(num1.charAt(i));
            StringBuilder sb = new StringBuilder();
            
            for(int k = 0 ; k < zeroCount; k++){
                sb.append("0");
            }
            
            for(j = num2.length()-1; j >= 0; j--){
                int n2 = Character.getNumericValue(num2.charAt(j));
                int prod = (n1 * n2) + carry;
                carry = prod / 10;
                sb.append(String.valueOf(prod % 10));
            }
            
            zeroCount++;
            if (carry > 0){
                sb.append(String.valueOf(carry));
                carry = 0;
            }
            sum = sum + Integer.parseInt(sb.reverse().toString());
        }
        return String.valueOf(sum);
    }
}