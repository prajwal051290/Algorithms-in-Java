/*
 * find number of bits which are '1' in an integer
 */

public class NumberOfOneBits {

	int numOneBits(int num){
		
		int count = 0;
		
		while (num>0){
			num = num & (num-1);
			count++;
		}
		return count;
	}
	
}
