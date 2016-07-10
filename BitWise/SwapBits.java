/*Determine the number of bits required to flip if you want to convert integer n to integer m.*/

class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        int xorNumber = a ^ b;
        int count = 0;
        int bitSize = 32;
        while (bitSize > 0){
            count += xorNumber & 1;
            xorNumber = xorNumber >> 1;
            bitSize--;
        }
        return count;
    }
};