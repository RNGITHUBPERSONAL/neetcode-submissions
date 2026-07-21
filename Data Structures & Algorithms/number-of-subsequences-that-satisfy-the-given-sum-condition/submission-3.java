class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int r = nums.length - 1;
        int l = 0;
        int result = 0;
        int[] power = new int[nums.length];
        power[0] = 1;
        int mod = 1000000007;
        for (int i = 1; i < nums.length; i++) {
            power[i] = (int) ((power[i - 1] * 2L) % mod);
        }
        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
               
                  result = (result + power[r - l]) % mod;
                l++;
            } else {
                r--;
            }
        }

        return result;
    }
}