// Logic:
/*
 * 1. loop through both the string numbers from back.
 * 2. keep adding each character by character. keep track of carry.
 * 3. keep adding the result in stringbuilder and at last reverse it.
 * 4. Imp Case: after the loop is over there is possibility of carry generation from previous addition.
 * 				append the last carry to stringBuilder as well. for eg: "9" + "1" = "10"
 */

public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for(; i >= 0 || j >= 0 ; i--,j--){
                int n1 = 0;
                int n2 = 0;
                
                if(i >= 0)
                    n1 = Character.getNumericValue(num1.charAt(i));
                if(j >= 0)
                    n2 = Character.getNumericValue(num2.charAt(j));
                    
                int sum = n1 + n2 + carry;
                
                if(sum >= 10){
                    carry = 1;
                    sum = sum % 10;
                }
                else
                    carry = 0;
                    
                sb.append(String.valueOf(sum));
        }
        
        if(carry == 1)
            sb.append(String.valueOf(carry));
        
        return sb.reverse().toString();
    }
}