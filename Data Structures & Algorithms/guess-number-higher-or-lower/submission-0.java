/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0, r=n;
        while(l<=n){
            int m=l+(r-l)/2;
            int pick=guess(m);
            if(0==pick) return m;
            else if(0> pick) r=m-1;
            else l=m+1;
        }
        return n;
    }
}