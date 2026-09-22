class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Left maximum
        int max = -1;

        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
            }
            left[i] = max;
        }
        // Right maximum
        max = -1;

        for (int i = height.length - 1; i >= 0; i--) {
            if (max < height[i]) {
                max = height[i];
            }
            right[i] = max;
        }
        int sum = 0;

        for (int i = 0; i < height.length; i++) {
            int min = Math.min(left[i], right[i]);
            int water =  min-height[i];
            sum = sum + water;
        }

        return sum;
    }
}
