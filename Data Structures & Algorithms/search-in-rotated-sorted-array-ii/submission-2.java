class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start=0, end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return true;
            if(nums[start]<nums[mid]){
                if(nums[mid]>target && nums[start]<=target) end=mid-1;
                else start=mid+1;
            }
            else if(nums[start]>nums[mid]){
                if(nums[mid]<target && nums[end]>=target) start=mid+1;
                else end=mid-1;
            }
            else start++;
        }
        return false;
    }
}