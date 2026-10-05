class Solution {
    public int characterReplacement(String s, int k) {
        int sol=0;
        HashSet<Character> h=new HashSet<>();
        for(char c : s.toCharArray()){
            h.add(c);
        }
        for(char c: h){
            int l=0;
            int cnt=0;
            for(int r=0;r<s.length();r++){
                if(s.charAt(r)==c){
                    cnt++;
                }
                while((r-l+1)-cnt>k){
                    if(s.charAt(l)==c) cnt--;
                    l++;
                }
                sol=Math.max(sol,r-l+1);
            }
        }
        return sol;
    }
}
