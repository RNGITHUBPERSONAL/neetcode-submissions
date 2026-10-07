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
        return start; //not end
    }
}

//if we have any -mnus element and it's outside we dont need to print -1, becase There is no valid array position -1.
// so thats why we use start  as return  not end ,