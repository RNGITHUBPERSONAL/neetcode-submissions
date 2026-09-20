class Solution {
    public void rotate(int[] nums, int k) {
        int j = 0;
  while(j<k){
for(int i=nums.length-2;i>=0;i--){
    int temp= nums[i];
    nums[i]=nums[i+1];
    nums[i+1]=temp;
}
j++;
    }
       
    }
}