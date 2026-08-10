class Solution {
    public String encode(List<String> strs) {
        StringBuffer result = new StringBuffer();
        for (String str : strs) {
            result.append(str.length()).append("*").append(str);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            int length = Integer.parseInt(s.substring(i, j));
            j++;
            result.add(s.substring(j, j + length));
            i = j + length;
        }

        return result;
    }
}
