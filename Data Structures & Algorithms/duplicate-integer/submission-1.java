class Solution {
    public boolean hasDuplicate(int[] nums) {
    // TC:O(nlogn) SC:1 or O(n)
    //    int n=nums.length;
    //    Arrays.sort(nums);
    //    for(int i=0;i<n-1;i++){
    //     if(nums[i]==nums[i+1]) return true;
    //    } 
    //    return false;
    // TC:O(n) SC: O(n);
        Set<Integer> s=new HashSet<>();
        for(int a:nums){
            if(s.contains(a)) return true;
            s.add(a);
        }
        return false;
    }
}