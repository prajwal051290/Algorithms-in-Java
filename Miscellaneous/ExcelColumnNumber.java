/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.
		
For example:
			
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    */
public class Solution {
    public String convertToTitle(int n) {
        
        Map<Integer,Character> charMap = new HashMap<Integer,Character>();
        int columnVal = 1;
        
        for (char ch='A';ch<='Y';ch++){
            charMap.put(columnVal,ch);
            columnVal++;
        }
        
        charMap.put(0,'Z');
        StringBuilder str = new StringBuilder("");
        
        while (n!=0){
            str.append(charMap.get(n%26));
            if (n%26==0){
                n = n/26;
                n=n-1;
            }
            else
                n = n/26;
        }
        return str.reverse().toString();
    }
}