class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int last = nums.length - 1;
        int mid = 0;

        // Phase 1: Find the pivot
        while (left < last) {
            mid = left + (last - left) / 2;

            if (nums[mid] > nums[last]) {
                left = mid + 1;
            } else {
                last = mid;
            }
        }

        int start = left;

        // Phase 2: Search the first sorted part
        if (start > 0 && nums[0] <= target
                && target <= nums[start - 1]) {

            left = 0;
            last = start - 1;

            while (left <= last) {
                mid = left + (last - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    last = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        // Phase 3: Search the second sorted part
        if (nums[start] <= target
                && target <= nums[nums.length - 1]) {

            left = start;
            last = nums.length - 1;

            while (left <= last) {
                mid = left + (last - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    last = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
