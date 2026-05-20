class Solution {
    public int[] replaceElements(int[] arr) {
   int [] newa = new int[arr.length];
      int max=-1;
for(int i=arr.length-1;i>0;i--){
     max=Math.max(max,arr[i]);
     newa[i-1]=max;

}
        newa[arr.length-1] = -1;
          return newa;
    }
  
}