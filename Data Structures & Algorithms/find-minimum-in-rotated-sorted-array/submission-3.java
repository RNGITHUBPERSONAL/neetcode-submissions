class Solution {
    public int findMin(int[] nums) {
    int end = nums.length - 1;
int start = 0;
int min=Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid]<=min){
                min=nums[mid];


            }

            if (nums[mid] <= nums[end]) {
                end = mid-1;
            } else if ((nums[mid] >= nums[start])) {
                start = mid+1;
            }
        }
        return min;
    }
}
