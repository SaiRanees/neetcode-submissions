class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // TC: O(nlogn+mlogm); SC: O(n+m) or 1;
        // char[] c=s.toCharArray();
        // char[] v=t.toCharArray();
        // Arrays.sort(c);
        // Arrays.sort(v);
        // if (Arrays.equals(c,v)) return true;
        // return false;
        Map<Character, Integer> c=new HashMap<>();
        Map<Character, Integer> v=new HashMap<>();
        for(int i=0;i<s.length();i++){
            c.put(s.charAt(i), c.getOrDefault(s.charAt(i),0)+1);
            v.put(t.charAt(i), v.getOrDefault(t.charAt(i),0)+1);
        }
        if(c.equals(v)) return true;
        return false;
    }
}
