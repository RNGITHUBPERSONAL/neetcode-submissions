class Solution {
    public int findMin(int[] nums) {
        int max=10000;
for(int num:nums){
    max=Math.min(max,num);
}
return max;
    }
}
