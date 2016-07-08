/*
 * 
 * Check if an integer is power of 2.
 * 
 * */


public class Solution {

	boolean isPowerTwo(int a){
		return (a>0) && ((a&(a-1))==0);
	}
	
}
