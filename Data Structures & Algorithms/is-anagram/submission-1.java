class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // TC: O(nlogn+mlogm); SC: O(n+m) or O(1);
        // char[] c=s.toCharArray();
        // char[] v=t.toCharArray();
        // Arrays.sort(c);
        // Arrays.sort(v);
        // if (Arrays.equals(c,v)) return true;
        // return false;
        // TC:O(n+m); SC:O(1);
        // Map<Character, Integer> c=new HashMap<>();
        // Map<Character, Integer> v=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     c.put(s.charAt(i), c.getOrDefault(s.charAt(i),0)+1);
        //     v.put(t.charAt(i), v.getOrDefault(t.charAt(i),0)+1);
        // }
        // if(c.equals(v)) return true;
        // return false;
        HashMap<Character, Integer> m=new HashMap<>();
        HashMap<Character, Integer> n=new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i),0)+1);
            n.put(t.charAt(i), n.getOrDefault(t.charAt(i),0)+1);
        }
        if(m.equals(n)) return true;
        return false;
    }
}
