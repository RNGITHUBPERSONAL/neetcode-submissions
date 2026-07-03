class Solution {
    public int findLonelyPixel(char[][] picture) {
        int n = picture.length;
        int m = picture[0].length;

        int rowCount [] = new int[n];
        int colCount [] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j] == 'B') {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j] == 'B' && rowCount[i] == 1 && colCount[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}
// First, you check where the B pixels are. Whenever you find a B, you check how many Bs
// are in its same row and its same column using the values already stored in rowCount and
// columnCount.

//rowCount[i]++ and colCount[j]++ are responsible for counting how many Bs are present in each 
//respective row and column.
