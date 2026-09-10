class Solution {
    public void sortColors(int[] nums) {
            int Countzero = 0;
        int Countone = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == nums[i]) {
                Countzero++;
            }
            if (1 == nums[i]) {
                Countone++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < Countzero) {
                nums[i] = 0;
            } else if (i< (Countone+Countzero)) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}