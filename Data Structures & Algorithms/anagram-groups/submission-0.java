class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String sort = new String(chararray);
            res.putIfAbsent(sort, new ArrayList<>());
            res.get(sort).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
