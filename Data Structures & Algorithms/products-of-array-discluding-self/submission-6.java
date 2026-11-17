class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) ans[i] = ans[i - 1] * nums[i - 1];
        int leftToRight = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[j] = ans[j] * leftToRight;
            leftToRight *= nums[j];
        }
        return ans;
    }
}
