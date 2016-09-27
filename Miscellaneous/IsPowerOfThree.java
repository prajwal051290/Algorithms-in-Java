/*Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?*/

/*
 * Logic:
 * Approach 1. Conver to base 3. Out put will be 1, 10, 100 ...
 * 		Use regex to matach the final string
 */

public class Solution {
    public boolean isPowerOfThree(int n) {
        return Integer.toString(n,3).matches("10*");
    }
}