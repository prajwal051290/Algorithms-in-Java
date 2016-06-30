/*Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.*/

public class Solution {
    public int romanToInt(String s) {
    
        char[] romans = s.toCharArray();
        int sum = 0;
        
        for(int i=0; i<romans.length; i++){
        if(i<romans.length-1 && getNums(romans[i]) < getNums(romans[i+1]))
            sum-=getNums(romans[i]);
        else
            sum+=getNums(romans[i]);
        }
        return sum;
    }
    
    private int getNums(char c){
        if(c=='I')
            return 1;
        else if(c=='V')
            return 5;
        else if(c=='X')
            return 10;
        else if(c=='L')
            return 50;
        else if(c=='C')
            return 100;
        else if(c=='D')
            return 500;
        else
            return 1000;
    }
}

