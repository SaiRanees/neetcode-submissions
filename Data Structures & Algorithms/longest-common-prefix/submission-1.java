class Solution {
    public String longestCommonPrefix(String[] strs) {
        // TC: O(n*m); SC:O(1)
        // for(int i=0;i<strs[0].length();i++){
        //     for(String s: strs){
        //         if(i==s.length() || s.charAt(i)!= strs[0].charAt(i)) return s.substring(0,i);
        //     }
        // }
        // return strs[0];
        // TC: O(n*mlogm); SC: O(1) or O(m);
        // Arrays.sort(strs);
        // int n=Math.min(strs[0].length(), strs[strs.length-1].length());
        // for(int i=0;i<n;i++){
        //     if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) return strs[0].substring(0,i);
        // }
        // return strs[0];
        Arrays.sort(strs);
        int n=Math.min(strs[0].length(), strs[strs.length-1].length());
        for(int i=0;i<n;i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) return strs[0].substring(0,i);
        }
        return strs[0];
    }
}