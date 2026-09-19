class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);int val=1;
for(int num:nums){
    if(num>0 && val==num){
       val++;  
    }
   
    
}
return val;
    }
}