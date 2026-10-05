class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // TC: O(n*mlogm); SC:O(m*n);
        // Map<String, ArrayList<String>> a=new HashMap<>();
        // for(String s:strs){
        //     char[] c=s.toCharArray();
        //     Arrays.sort(c);
        //     String sort= new String(c);
        //     a.putIfAbsent(sort, new ArrayList<>());
        //     a.get(sort).add(s);
        // }
        // return new ArrayList<>(a.values());
        Map<String, ArrayList<String>> a=new HashMap<>();
        for(String s: strs){
            char[] c=new char[26];
            for(char n: s.toCharArray()){
                c[n-'a']++;
            }
            String m=Arrays.toString(c);
            a.putIfAbsent(m,new ArrayList<>());
            a.get(m).add(s);
        }
        return new ArrayList<>(a.values());
    }
}
