class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            map.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
