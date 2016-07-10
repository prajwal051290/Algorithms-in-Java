/*Given two binary strings, return their sum (also a binary string).*/

public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        int carry = 0;
        int loopSize = Math.max(aLength, bLength);
        String result = "";
        for (int i = 0; i < loopSize; i++){
            int aBit = i < aLength ? a.charAt(aLength -1 -i) - '0' : 0;
            int bBit = i < bLength ? b.charAt(bLength -1 -i) - '0' : 0;
            int temp = aBit + bBit + carry;
            carry = temp / 2;
            result = temp % 2 + result;
        }
        return carry == 0 ? result : "1" + result;
    }
}