class Solution {
  public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int newArray[] = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      newArray[i] = nums[i];
      newArray[n] = nums[i];
      n++;
    }
    return newArray;
  }
}