class Solution {
    public String encode(List<String> strs) {
        StringBuffer result = new StringBuffer();
        for (String str : strs) {
            result.append(str.length()).append("*").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '*') j++;
            int length = Integer.parseInt(str.substring(i, j));
            j++;
            list.add(str.substring(j, j + length));
            i = j + length;
        }

        return list;
    }
}
