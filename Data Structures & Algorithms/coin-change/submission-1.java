class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        if(amount==0) return 0;
        for(int i=0;i<=amount;i++){
            dp[i]=amount+1;
        }
        dp[0]=0;
        for(int c:coins){
            for(int i=c;i<=amount;i++){
                dp[i]=Math.min(dp[i],dp[i-c]+1);
            }
        }
        if(dp[amount]==amount+1) return -1;
        return dp[amount];
    }
}
