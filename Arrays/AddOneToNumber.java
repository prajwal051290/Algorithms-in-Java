/*Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.*/

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
	    if (a == null) {
	        return null;
	    }
	    
	    int i = 0;
	    
	    for (i = 0; i < a.size() && a.get(i) == 0; i++);
	    
	    int firstDigitIndex = i;
	    int carry = 1;
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    for (i = a.size() - 1; i >= firstDigitIndex; i--) {
	        int sum = a.get(i) + carry;
	        result.add(0, sum % 10);
	        carry = sum / 10;
	    }
	    
	    if (carry == 1) {
	        result.add(0, carry);
	    }
	    return result;
	}
}
