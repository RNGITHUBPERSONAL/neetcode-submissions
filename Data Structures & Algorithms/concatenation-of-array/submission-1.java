class Solution {
    public int[] getConcatenation(int[] nums) {
        int j = nums.length; // 3
        int len = nums.length * 2; // 6
        int[] newNums = new int[len]; // 6

        for (int i = 0, k = j; i < nums.length; i++, k++) {
            newNums[i] = nums[i];
            newNums[k] = nums[i];
        }
        return newNums;
    }
}