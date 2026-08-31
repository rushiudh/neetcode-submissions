class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums1)
            set.add(x);
        List<Integer> list = new ArrayList<>();
        for(int i : nums2)
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
                

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}