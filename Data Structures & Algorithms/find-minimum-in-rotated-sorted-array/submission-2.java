class Solution {
    public int findMin(int[] nums) {
  int min = Integer.MIN_VALUE;
int result=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]) > min) {
                min = nums[i];
            }else {
                result=  nums[i];
                break;
            }
        }
        return result;
    }
}
