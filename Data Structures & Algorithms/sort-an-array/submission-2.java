class Solution {
    public int[] sortArray(int[] nums) {
         
devide(0,nums.length-1,nums);

return nums;


    }
    }

    private static void devide(int start, int end, int[] nums) {
   if(start==end) return;
        int mid=(start+end)/2;
          devide(start,mid,nums);
        devide(mid+1,end,nums);
         conqure(start,mid,end,nums);

    }

    private static void conqure(int start, int mid, int end, int[] nums) {
      int arr[]= new int[end-start+1];

        int pointer1=start;
        int  pointer2=mid+1;
        int k=0;
        while(pointer1<=mid && pointer2<=end){
            if(nums[pointer1] <= nums [pointer2]){
                arr[k]=nums[pointer1];
                k++;pointer1++;
            }else{
                arr[k]=nums[pointer2];
                k++;pointer2++;
            }
        }while(pointer1<=mid){
            arr[k]=nums[pointer1];
            k++;pointer1++;
        }
        while(pointer2<=end){
            arr[k]=nums[pointer2];
            k++;pointer2++;
        }
for(int i=0;i<arr.length;i++){
    nums[start+i]=arr[i];
}

    
}