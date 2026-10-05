class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>  h=new HashSet<>();
        int l=0;
        for(int i=0;i<nums.length;i++){
            while(i-l>k){
                h.remove(nums[l]);
                l++;
            }
            while(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
        }
        return false;
    }
}