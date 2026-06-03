class Solution {
    public int[] productExceptSelf(int[] nums) {
         int first[] = new int[nums.length];
        int sec[] = new int[nums.length];
        int res[] = new int[nums.length];

        first[0]=1;
        for (int i = 1; i < nums.length ; i++) {
            first[i] = first[i-1] * nums[i-1];


        }
        sec[nums.length-1]=1;
       
        for (int i = nums.length-1; i >= 1 ; i--) {

        sec[i-1]=sec[i]*nums[i];

        }



        for(int i=0;i<nums.length;i++){
            res[i]=first[i]*sec[i];
        }
        return res;    
    }
}  
