class Solution {
    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Step 1: Target found
            if (nums[mid] == target) {
                return true;
            }

            // Step 2: Duplicates make it impossible to
            // determine which half is sorted.
            if (nums[left] == nums[mid]
                    && nums[mid] == nums[right]) {

                left++;
                right--;
            }

            // Step 3: Left half is sorted only cheking without dulpicate
            else if (nums[left] <= nums[mid]) {

                // Check whether target lies in the left half
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Step 4: Right half is sorted  only cheking without dulpicate
            else {

                // Check whether target lies in the right half
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        // Target not found
        return false;
    }
}