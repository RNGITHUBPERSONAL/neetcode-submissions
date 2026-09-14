class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    int left[]= new int[nums.length];
    int leftVal=1;
    for(int i=0;i<nums.length;i++){
        left[i] =leftVal;
        leftVal=leftVal*nums[i];
    }

        int right[]= new int[nums.length];
        int rightVal=1;
        for(int i=nums.length-1;i>=0;i--){
            right[i] =rightVal;
            rightVal=rightVal*nums[i];
        }

     return    IntStream.range(0,nums.length).map(i->left[i]*right[i]).toArray();
    }
}  
