class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0, r=0;
        for(int w: weights){
            l=Math.max(l,w);
            r+=w;
        }
        int res=r;
        while(l<=r){
            int m=l+(r-l)/2;
            if(count(weights, days, m)){
                res=Math.min(res,m);
                r=m-1;
            }
            else l=m+1;
        }
        return res;
    }
    public boolean count(int[] we, int day, int cap){
        int ship=1, currcap=cap;
        for(int w: we){
            if(currcap-w<0){
                ship++;
                if(ship>day) return false;
                currcap=cap;
            }
            currcap-=w;
        }
        return true;
    }
}