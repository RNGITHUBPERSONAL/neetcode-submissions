class Solution {
    public void rotate(int[] nums, int k) {
          k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);

        reverseArray(nums, k, nums.length - 1);
    }
}
private static void reverseArray(int[] nums, int i, int k) {
    while (i < k) {
        int num = nums[i];
        nums[i] = nums[k];
        nums[k] = num;
        i++;
        k--;
    }
}
