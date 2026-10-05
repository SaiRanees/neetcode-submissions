class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(), m=word2.length();
        StringBuilder s=new StringBuilder();
        int l=0,r=0;
        while(l<n && r<m){
            s.append(word1.charAt(l++));
            s.append(word2.charAt(r++));
        }
        s.append(word1.substring(l));
        s.append(word2.substring(r));
        return s.toString();
    }
}