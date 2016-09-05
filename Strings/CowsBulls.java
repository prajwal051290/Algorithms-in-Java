/*You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"

Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".

Please note that both secret number and friend's guess may contain duplicate digits, for example:

Secret number:  "1123"
Friend's guess: "0111"

In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
*/

//Logic:
/*
 * Maintain array of 10 integers.
 * 1. count bulls straight away
 * 2. if characters don't match then increment count at secret string character
 *    & decrement count at guess string character. 
 * 3. This will help maintain cows
 */

public class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] nums = new int[10];
        for(int i=0; i<secret.length(); i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 == ch2) bulls++;
            else{
                if(nums[ch2-'0']>0) cows++;
                if(nums[ch1-'0']<0) cows++;
                nums[ch1-'0']++;
                nums[ch2-'0']--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}