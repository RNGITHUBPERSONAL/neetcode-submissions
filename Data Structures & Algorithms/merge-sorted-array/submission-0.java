public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = m - 1;
        int n1 = n - 1;
        ;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m1 < 0) {
                nums1[i] = nums2[n1];
                n1 = n1 - 1;
                continue;
            }
            if (n1 < 0) {
                nums1[i] = nums1[m1];
                m1 = m1 - 1;
                continue;
            }

            if (nums1[m1] >= nums2[n1]) {
                nums1[i] = nums1[m1];
                m1 = m1 - 1;

            } else if ((nums1[m1] < nums2[n1])) {
                nums1[i] = nums2[n1];
                n1 = n1 - 1;
            }
        }
    }
}