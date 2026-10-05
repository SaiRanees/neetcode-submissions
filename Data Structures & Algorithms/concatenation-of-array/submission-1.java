class Solution {
    public int[] getConcatenation(int[] nums) {
        // //TC:O(n); SC:O(n);
        // // int n=nums.length;
        // // int[] s=new int[2*n];
        // // int j=0;
        // // for(int i=0;i<2;i++){
        // //     for(int a:nums){
        // //         s[j++]=a;
        // //     }
        // // }
        // // return s;
        // //TC: O(n); SC:O(n);
        // int n=nums.length;
        // int[] sol=new int[2*n];
        // for(int i=0;i<n;i++){
        //     sol[i]=sol[i+n]=nums[i];
        // }
        // return sol;
        int n=nums.length;
        int[] c=new int[2*n];
        for(int i=0;i<n;i++){
            c[i]=c[i+n]=nums[i];
        }
        return c;
    }
}