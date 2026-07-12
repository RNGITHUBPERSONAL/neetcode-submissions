class Solution {
  public int pivotIndex(int[] nums) {
    int totalSum = 0;
    int leftSideSum = 0;
    int rightSideSum = 0;
    for (int i = 0; i < nums.length; i++) {
      totalSum = totalSum + nums[i];//28
    }
    for (int i = 0; i < nums.length; i++) {
     
      rightSideSum = totalSum - nums[i] - leftSideSum;

      if (rightSideSum == leftSideSum) {
        return i;
      }

 leftSideSum = leftSideSum + nums[i];


    }
    return -1;
  }
}