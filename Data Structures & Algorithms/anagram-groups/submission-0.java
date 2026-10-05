class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> a=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sort= new String(c);
            a.putIfAbsent(sort, new ArrayList<>());
            a.get(sort).add(s);
        }
        return new ArrayList<>(a.values());
    }
}
