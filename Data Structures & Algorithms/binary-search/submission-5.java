class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
//why -1,+1
//nums = [1, 3, 5, 7, 9]
//              ↑
 //            mid

//If:
//nums[mid] > target
//then we know the target is not mid, because we just checked it and it wasn't the target.  IN THE FIRST IF CONDTION
//why start <= end? becase let say 2<2 so it false, so we just skip one lement , we also need to include that elment in our search