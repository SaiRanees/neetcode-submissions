class Solution {
    public int mySqrt(int x) {
        int l=0, r=x, sol=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if((long)m*m==x) return m;
            else if((long)m*m<x) {
                l=m+1;
                sol=m;
            }
            else r=m-1;
        }
        return sol;
    }
}