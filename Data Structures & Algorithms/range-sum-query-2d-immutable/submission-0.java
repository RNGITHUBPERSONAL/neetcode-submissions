class NumMatrix {
 int[][] matrix1;
    public NumMatrix(int[][] matrix) {

     
      matrix1 = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

int sum=0;

         for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){


                   sum=sum+matrix1[i][j];

            }
    }
    return sum;
}
}
