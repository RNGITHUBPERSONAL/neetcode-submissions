class Solution {
    public long maximumSumScore(int[] nums) {
        long max = Long.MIN_VALUE;
        long prefixsum = 0;
        long suffixSum = 0;
        long totalSum = 0;
        long currentMax = 0;

        for (int num : nums) {
            totalSum = totalSum + num;
        }
        for (int i = 0; i < nums.length; i++) {
            prefixsum = prefixsum + nums[i];
            suffixSum = totalSum - prefixsum + nums[i];

            currentMax = Math.max(prefixsum, suffixSum);
            max = Math.max(currentMax, max);
        }
        return max;
    }
}
