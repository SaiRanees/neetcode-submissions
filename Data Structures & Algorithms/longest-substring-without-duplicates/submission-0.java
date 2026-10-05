class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sol=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            Set<Character> rep=new HashSet<>();
            for(int j=i;j<n;j++){
                if(rep.contains(s.charAt(j))) break;
                rep.add(s.charAt(j));
                sol=Math.max(sol,rep.size());
            }
        }
        return sol;
    }
}
