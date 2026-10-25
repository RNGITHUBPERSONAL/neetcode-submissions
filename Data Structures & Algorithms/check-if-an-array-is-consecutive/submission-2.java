class Solution {
    public boolean isConsecutive(int[] nums) { int min=Integer.MAX_VALUE; int max=-Integer.MIN_VALUE;
for(int num:nums){
            if(min>num){
                min=num;
            }
            if(max<num){
                max=num;
            }
        }
        if(max-min+1== nums.length){
            return true;
        }
        return false;
    }
}
