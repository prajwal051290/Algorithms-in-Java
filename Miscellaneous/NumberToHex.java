/*Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

Note:

All letters in hexadecimal (a-f) must be in lowercase.
The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
The given number is guaranteed to fit within the range of a 32-bit signed integer.
You must not use any method provided by the library which converts/formats the number to hex directly.*/

/*
 * Logic:
 * Same as number to binary. Only the base is different.
 * keep dividing the input number till you get zero
 * 
 * -Ve numbers are not handled here. Need to understand two's complement conversion.
 * For eg: -1 is ffffffff
 * 
 */

public class Solution {
    public String toHex(int num) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder stb = new StringBuilder();
        
        if (num == 0)
            return "0";
            
        while(num!=0){
            int mod = num % 16;
            num = num/16;
            stb.append(hex[mod]);
        }
        return stb.reverse().toString();
    }
}