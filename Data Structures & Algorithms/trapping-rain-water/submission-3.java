class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Left maximum
        int max = -1;

        for (int i = 0; i < height.length; i++) {
             left[i] = max;
            if (max < height[i]) {
                max = height[i];
            }
           
        }
        // Right maximum
        max = -1;

        for (int i = height.length - 1; i >= 0; i--) {
             right[i] = max;
            if (max < height[i]) {
                max = height[i];
            }
           
        }
        int sum = 0;

        for (int i = 0; i < height.length; i++) {
            int min = Math.min(left[i], right[i]);
            int water =  min-height[i];
            if(water<0){
                water=0;
            }
            sum = sum + water;
        }

        return sum;
    }
}


// Excluding current
//         int max = 0;

//         for (int i = 0; i < n; i++) {
//             left[i] = max;

//             if (height[i] > max) {
//                 max = height[i];
//             }
//         }
// Including current
//         int max = 0;

//         for (int i = 0; i < n; i++) {

//             if (height[i] > max) {
//                 max = height[i];
//             }

//             left[i] = max;
//         }

















