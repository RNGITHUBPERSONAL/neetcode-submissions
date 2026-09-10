class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int val = 0;
        int i = 0;
        for (int cnt : count) {
            for (int j = 0; j < cnt; j++) {
                nums[i] = val;
                i++;
            }
            val++;
        }
    }
}