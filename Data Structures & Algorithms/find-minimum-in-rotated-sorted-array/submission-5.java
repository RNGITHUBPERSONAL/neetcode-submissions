class Solution {
    public int findMin(int[] nums) {
       int start =0;int end=nums.length-1;
       
       while(start<end){
           int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            } else{ //means  if nums[start]<nums[mid]  //3,4,5,6,1,2 or   nums[mid]<nums[end]
                end=mid;
            }

       }
       
//nums[mid]<nums[end]  we search left or right , we need to go left because right is increse , so we move left end =mid,so it might be small we neee to
       
       return nums[start];
    }
}
