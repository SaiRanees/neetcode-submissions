class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        // TC: O(n^2) SC:O(1);
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target) return new int[]{i,j};
        //     }
        // }
        // return new int[0];
        // TC: O(n); SC: O(n);
        // HashMap<Integer, Integer> c=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     c.put(nums[i],i);
        // }
        // for(int i=0;i<n;i++){
        //     int d = target-nums[i];
        //     if(c.containsKey(d) && c.get(d)!=i) return new int[]{i,c.get(d)}; 
        // }
        // return new int[0];
        HashMap<Integer, Integer> m=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (m.containsKey(diff)) {
                return new int[] { m.get(diff), i };
            }

            m.put(num, i);
        }

        return new int[0];
    }
}
