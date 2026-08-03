class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
           int min = nums[i];
           int max = nums[i];
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                if (Math.abs(max - min) <= limit) {
                    ans = Math.max(ans, j - i + 1);

                } else {
                    break;
                }
            }
        }

        return ans;
    }
}