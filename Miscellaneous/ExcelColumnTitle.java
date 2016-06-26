/*Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.*/

/*For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 */
	
	
public class Solution {
    public int titleToNumber(String s) {
        
        char[] inputArr = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        //Create hashmap of A-Z alphabets
        int i = 1;
        int index = 0;
        int number = 0;
        
        for(char ch = 'A'; ch <= 'Z'; ch++){
            charMap.put(ch,i);
            i++;
        }
        
        int j=0;
        for (i=inputArr.length-1; i >= 0; i--){
            index = charMap.get(inputArr[i]);
            number += Math.pow(26,j)*index;
            j++;
        }
        
        return number;
    }
}