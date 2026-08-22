class Solution {
    public int trap(int[] height) {

 int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Left maximum
        int max = 0;
        for (int i = 0; i < n; i++) {
            left[i] = max;
            max = Math.max(max, height[i]);
        }

        // Right maximum
        max = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = max;
            max = Math.max(max, height[i]);
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            int water = waterLevel - height[i];

            if (water > 0) {
                sum += water;
            }
        }

        return sum;
    }
}
