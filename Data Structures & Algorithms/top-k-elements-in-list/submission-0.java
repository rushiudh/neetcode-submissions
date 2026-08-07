class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        Queue<Map.Entry<Integer, Integer>> pq = new PriorityQueue((a, b) -> b.value() - a.value());
        pq.addAll(map.entrySet());
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll().getKey();
        }
        return arr;
    }
}
