class Solution {
    public void sortColors(int[] nums) {
         int count[]= new int[3];
        int start=0;
       

while(start<nums.length){
         if(nums[start]==0){
             count[0]++;
         } else if (nums[start]==1) {
             count[1]++;
         }else{
             count[2]++;
         }
    start++;
}

        int i=0;int val=0;
        for(int cn:count){

            while(cn>=1){
                nums[i]=val;
                cn--;
                i++;
            }
            val++;

        }
    }
}