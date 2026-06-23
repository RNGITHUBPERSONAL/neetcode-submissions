class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        if (nums[nums.length - 1] < target) {
          
            return nums.length;
        }
        while (first <= last) {
            int mid = (first + last) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target && nums[mid + 1] > target) {
               
                return mid + 1;
            }

            else if (nums[mid] > target) {
                last = mid - 1;
            } else if (nums[mid] < target) {
                first = mid + 1;
            }
        }
        return 0;
    }
}