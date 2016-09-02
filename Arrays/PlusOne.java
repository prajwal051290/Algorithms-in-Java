/*Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.*/

// Logic: if digit less than 9, just add 1 and return at that instance.
// if 9 then, put zero at that position and go ahead. if till end of array, a;; are 9s then create new array with
// length+1 and put '1' in index 0.

public class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] sum = new int[digits.length+1];
        sum[0] = 1;
        return sum;
    }
}