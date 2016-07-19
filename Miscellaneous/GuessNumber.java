/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low = 1;
        int mid = 0;
        while(low <= n){
            mid = low + ( n - low )/2;
            int pick = super.guess(mid);
            if (pick == -1)
                n = mid - 1;
            else if (pick == 1)
                low = mid + 1;
            else
                break;
        }
        return mid;
    }
}