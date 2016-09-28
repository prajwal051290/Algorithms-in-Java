/*Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...

Note:
n is positive and will fit within the range of a 32-bit signed integer (n < 231).*/

/*
 * Logic:
 * 1 to 9 are special cases.
 * then consider brackets [10..99], [100..999], [1000..9999] so on...
 * Base of bracket is variable "start"
 * number length is variable "length"
 * count of numbers in a bracket are variable "count"
 * 
 * Below solution did not pass through all TCs of leetcode though
 */

public class Solution {
    public int findNthDigit(int n) {
        int length = 1;
        int count = 9;
        int start = 1;
        while(n > length*count){
            n = n - (length*count);
            length = length + 1;
            count = count * 10;
            start = start * 10;
        }
        start = start + (n-1)/length;
        String num = Integer.toString(start);
        return Character.getNumericValue(num.charAt((n-1)%length));
    }
}