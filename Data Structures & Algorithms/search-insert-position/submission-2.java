class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;

        while (start <= last) {
            int mid = (start + last) / 2;

            if ( mid<nums.length-1 && nums[mid] < target && nums[mid + 1] > target) {
                return mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return start;
    }
}