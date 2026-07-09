class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int res = 0;
        int right = 0;
        int left = 0;
        int mul = 1;




        while (right < nums.length) {
            mul = mul * nums[right];
                while (mul >= k && left<=right) {

                    mul = mul / nums[left];
                    left++;
                }
            res=res+((right-left)+1);

            right++;
        }
        return res;
    }
}