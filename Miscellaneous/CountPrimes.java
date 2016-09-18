/*Count the number of prime numbers less than a non-negative number, n.*/

/*
 * Logic:
 * 
 * Let's write down all of 12's factors:
 * 
 *  2 × 6 = 12
	3 × 4 = 12
	4 × 3 = 12
	6 × 2 = 12
 * 
 * 
 * As you can see, calculations of 4 × 3 and 6 × 2 are not necessary. Therefore, we only need to consider factors up to √n because, if n is divisible by some number p, then n = p × q and since p ≤ q, we could derive that p ≤ √n.
Our total runtime has now improved to O(n1.5), which is slightly better.
 */

public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i<n; i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }
    
    private boolean isPrime(int num){
        for(int i=2; i*i <= num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}