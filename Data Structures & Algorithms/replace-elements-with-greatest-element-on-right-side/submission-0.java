class Solution {
    public int[] replaceElements(int[] arr) {
      int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j] ){
                    max=arr[j];
                }

            }
            arr[i]=max;
            max=0;
        }
        arr[arr.length-1]=-1;  
          return arr;
    }
  
}