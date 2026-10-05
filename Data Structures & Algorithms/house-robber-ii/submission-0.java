class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(cir(nums,0,n-2), cir(nums,1,n-1));
    }
    public int cir(int[] nums,int start, int end){
        int pre1=0;
        int pre2=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(pre1, nums[i]+pre2);
            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    }
}
