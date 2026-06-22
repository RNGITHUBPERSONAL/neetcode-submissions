class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int row = matrix.length;
        int coloumn = matrix[0].length;
        int top = 0;
        int bottom = row - 1;

        while (top <= bottom) {

            int foundRow = (top + bottom) / 2;

            if (matrix[foundRow][0] > target) {
                bottom = foundRow - 1;
            } else if (matrix[foundRow][coloumn - 1] < target) {
                top = foundRow + 1;

            } else {
                break;
            }

        }
        if (top > bottom) {
            return false;
        }

        int foundRow = (top + bottom) / 2;
        int last = matrix[0].length-1;
        int first = 0;
        while (first <= last) {

            int mid = (first + last) / 2;

            if (matrix[foundRow][mid] == target) {
              return true;
            } else if (matrix[foundRow][mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }


        }
        return false;
    }
}
