class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int found = 0;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                found = i;
                break;
            }
        }
        int search[] = matrix[found];
        int left = 0;
        int right = search.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (search[mid] == target) {
                return true;
            } else if (search[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
