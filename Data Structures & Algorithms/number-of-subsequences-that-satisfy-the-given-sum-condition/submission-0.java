
class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        int n = nums.length;

        Arrays.sort(nums);

        // powers[i] = 2^i
        int[] powers = new int[n];
        powers[0] = 1;

        for (int i = 1; i < n; i++) {
            powers[i] = (int) ((powers[i - 1] * 2L) % mod);
        }

        int left = 0;
        int right = n - 1;
        int answer = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                // nums[left] is definitely included as the minimum.
                // Elements between left+1 and right can be chosen or skipped.
                answer = (answer + powers[right - left]) % mod;

                left++;
            } else {
                right--;
            }
        }

        return answer;
    }
}