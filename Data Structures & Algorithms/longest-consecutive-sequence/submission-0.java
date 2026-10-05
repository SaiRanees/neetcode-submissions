class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }
        int len=0;
        for(int a:nums){
            if(!s.contains(a-1)){
                int l=1;
                while(s.contains(a+l)){
                    l++;
                }
                len=Math.max(len,l);
            }
        }
        return len;
    }
}
