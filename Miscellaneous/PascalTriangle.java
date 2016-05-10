package arrayQuiz;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		System.out.println("Please enter a number");
		
		int n = sc.nextInt();
		
		result = PascalTriangle.pascal(n);
		
		System.out.println(result);
	
	}
	
	static ArrayList<ArrayList<Integer>> pascal(int n){
	
		ArrayList<Integer> pre = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		if (n<=0)
			return result;
			
		pre.add(1);
		result.add(pre);
		
		for (int i=1; i<n; i++){
		
			ArrayList<Integer> curr = new ArrayList<Integer>();
			curr.add(1); // First Element
			
			for (int j=0; j<pre.size()-1; j++)
				curr.add(pre.get(j) + pre.get(j+1));
			
			curr.add(1); // Last Element
			result.add(curr);
			pre = curr;		
			
		}	
		
		return result;
		
	}
}
