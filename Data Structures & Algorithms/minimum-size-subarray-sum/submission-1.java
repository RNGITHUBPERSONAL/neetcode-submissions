class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length - 1;

        int sum = 0;
        int res = 9999;
        while (right <= len) {
            sum = sum + nums[right];
            while (sum >= target) {
                sum = sum - nums[left];

                res = Math.min(res, right - left + 1);
                left++;
            }
            right++;
        }

        return res==9999?0:res;
    }
}