/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

// Logic: use stack. To make this code better, use map of symbols: "(),{},[]"

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char symbol = s.charAt(i);
            if (symbol == '(' || symbol == '{' || symbol == '[')
                st.push(symbol);
            else{
                if(st.isEmpty())
                    return false;
                char topSymbol = (char)st.pop();
                if(topSymbol == '('){
                    if(symbol != ')')
                        return false;
                }    
                else if (topSymbol == '{'){
                    if(symbol != '}')
                        return false;
                }
                else if (topSymbol == '['){
                    if(symbol != ']')
                        return false;
                }
            }
        }
        return st.isEmpty();
    }
}