class Solution {
    public void sortColors(int[] nums) {
          int[] count = new int[3];
        int k=0,m=0;
        for (int num : nums) {

            count[num]=count[num]+1;
        }

        for(int num:count){

            while (num>=1){
                nums[m++]=k;
                num--;
            }
            k++;
        }
       
    }
}