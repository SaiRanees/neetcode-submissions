class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        int maxSum = dp[0];
        for (int sum : dp) {
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
