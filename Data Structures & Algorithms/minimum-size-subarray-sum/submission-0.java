class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sol=0;
        int res=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sol+=nums[r];
            while(sol>=target){
                res=Math.min(r-l+1,res);
                sol-=nums[l];
                l++;
            }
        }
        if(res==Integer.MAX_VALUE) return 0;
        return res;
    }
}