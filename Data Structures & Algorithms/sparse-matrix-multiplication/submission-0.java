class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m= mat1.length;
int n=mat2[0].length;
        int common = mat1[0].length;
int res[][]=new int[m][n];
            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < common; k++) { //how many row it create
                        res[i][j] = res[i][j] + mat1[i][k] * mat2[k][j];

                    }

                }
            }
return res;
    }
}
