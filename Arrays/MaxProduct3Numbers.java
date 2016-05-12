package arrayQuiz;

/*
 * Solution: Max of (max1*max2*max3 OR max1*min1*min2) coz min1 & min2 can be negative numbers..
 */

public class MaxProduct3Numbers {

	public static void main(String[] args) {
		
		int[] arr = {10,5,-15,3,7,20,1};
		int result = maxProd(arr);
		System.out.println("Maximum product of 3 numbers in an array: " + result);
		
	}

	static int maxProd(int[] arr)
	{
		int max1 = arr[0], max2 = 0, max3 = 0;
		int min1 = arr[0], min2 = 0;
		int max_index = 0, min_index = 0;
		
		for (int i=0; i<arr.length; i++){
			
			if (arr[i] > max1){
				max1 = arr[i];
				max_index = i;
			}
			
			else if (arr[i] < min1){
				min1 = arr[i];
				min_index = i;
			}
		}
		
		max2 = min1;
		max3 = min1;
		min2 = max1;
		
		for (int i=0; i<arr.length; i++){
			
			if (i == max_index || i == min_index)
				continue;
			
			if (arr[i] > max2){
				max3 = max2;
				max2 = arr[i];
			}
			else if (arr[i] > max3)
				max3 = arr[i];
			
			if (arr[i] < min2){
				min2 = arr[i];
			}
			
		}
		
		int prod1 = 0, prod2 = 0;
		
		prod1 = max1 * max2 * max3;
		prod2 = max1 * min1 * min2;
		
		if (prod1 > prod2)
			return prod1;
		else
			return prod2;
		
	}
}
