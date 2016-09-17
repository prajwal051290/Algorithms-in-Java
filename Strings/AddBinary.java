/*Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".*/

/*
 * Logic: division gives carry and% gives sum
 * Below code is very neat and clean
 */

public class Solution {
    public String addBinary(String a, String b) {
        int x = a.length();
        int y = b.length();
        int length = Math.max(x,y);
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<length; i++){
            int p = i < x ? a.charAt(x-1-i) - '0' : 0;
            int q = i < y ? b.charAt(y-1-i) - '0' : 0;
            int temp = p + q + carry;
            carry = temp / 2;
            int sum = temp % 2;
            result.append(Integer.toString(sum));
        }
        
        if(carry == 1)
            result.append("1");
            
        return result.reverse().toString();
    }
}