class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute Force TC:O(n*m);
        // int sol=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     Set<Character> rep=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         if(rep.contains(s.charAt(j))) break;
        //         rep.add(s.charAt(j));
        //         sol=Math.max(sol,rep.size());
        //     }
        // }
        // return sol;
        // Sliding Window TC O(n);
        HashSet<Character> rep=new HashSet<>();
        int l=0;
        int sol=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            while(rep.contains(s.charAt(i))){
                rep.remove(s.charAt(l));
                l++;
            }
            rep.add(s.charAt(i));
            sol=Math.max(sol,i-l+1);
        }
        return sol;
    }
}
