class Solution {
    public int smallestCommonElement(int[][] mat) {
             int col=mat.length;
       int row=mat[0].length;
       int count[]= new int[10001];
for(int i=0;i<col;i++) {
    for (int j = 0; j < row; j++) {
        count[mat[i][j]]++;

    }
}
for(int i=0;i<count.length;i++){
    if(count[i]==col){
      return i;
      
    }
} 
return -1;
    }
}
