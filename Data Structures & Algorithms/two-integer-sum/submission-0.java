class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = nums[0];
        while (firstIndex < nums.length() - 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[firstIndex] + nums[i] == target)
                    return new int[] {firstIndex, i};
            }
            firstIndex++;
        }
        
    }
}
