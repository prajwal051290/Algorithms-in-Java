/*Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

NOTE : If there are multiple answers possible, return the one thats lexicographically smallest. */

/*
 * Logic:
 * 1. sort the given array
 * 2. create result with each pair of numbers
 * 3. This could be done in place by swapping the adjacent pair of numbers
 */

public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    if(a == null)
	        return null;
	   
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    Collections.sort(a);
	    int i = 1;
	    for(; i < a.size(); i=i+2) {
	        result.add(a.get(i));
	        result.add(a.get(i-1));
	    }
	    if (i-1 < a.size())
	        result.add(a.get(i-1));
	        
	   return result;
	}
}
