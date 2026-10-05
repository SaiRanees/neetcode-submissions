class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int speed=1;
        // while(true){
        //     long time=0;
        //     for(int pile:piles){
        //         time+=(int)Math.ceil((double)pile/speed);
        //     }
        //     if(time<=h) return speed;
        //     speed++;
        // }
        int n=piles.length;
        Arrays.sort(piles);
        int l=1;
        int r=piles[n-1];
        int res=r;
        while(l<=r){
            int m=l+(r-l)/2;
            long time=0;
            for(int p:piles){
                time+=Math.ceil((double)p/m);
            }
            if(time<=h){
                res=m;
                r=m-1;
            }
            else l=m+1;
        }
        return res;
    }
}
