class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    HashSet<List<Integer>> res = new HashSet<>();
    List<Integer> arrList = null;
    for (int i = 0; i < nums.length; i++) {
      for (int k = i + 1; k < nums.length; k++) {
        left = k + 1;
        right = nums.length - 1;
        while (left < right) {
         long sum = (long)nums[left] + nums[right] + nums[i]+nums[k];
          if (sum == target) {
            arrList = new ArrayList<>();
              arrList.add(nums[k]);
              arrList.add(nums[left]);
              arrList.add(nums[right]);
              arrList.add(nums[i]);
            res.add(arrList);
            left++;
            right--;
          } else if (sum > target) {
            right--;
          } else {
            left++;
          }
        }
      }
    }
  return   new ArrayList<>(res);
  }
}