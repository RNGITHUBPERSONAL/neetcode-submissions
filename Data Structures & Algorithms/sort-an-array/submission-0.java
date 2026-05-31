class Solution {
    public int[] sortArray(int[] nums) {
           divide(0, nums.length - 1, nums);
       return nums;
    }

      public static void divide(int start, int end, int[] nums) {
        if (start >=end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(start, mid, nums);//10,5,6
        divide(mid + 1, end, nums);//3,7
        conquer(start, mid, end, nums);


    }

    private static void conquer(int start, int mid, int end, int[] nums) {

        int array[] = new int[end - start + 1];

        int pointer1 = start;
        int pointer2 = mid + 1;
        int k = 0;
        while (pointer1 <= mid && pointer2 <= end) {
            if (nums[pointer1] <= nums[pointer2]) {
                array[k] = nums[pointer1];
                k++;
                pointer1++;
            } else {
                array[k] = nums[pointer2];
                k++;
                pointer2++;
            }

        }

        while (pointer1 <= mid) {
            array[k] = nums[pointer1];
            k++;pointer1++;
        }
        while (pointer2 <= end) {
            array[k] = nums[pointer2];
            k++; pointer2++;
        }

        for (int i = 0; i < array.length; i++) {
            nums[start + i] = array[i];
        }
    }
}
