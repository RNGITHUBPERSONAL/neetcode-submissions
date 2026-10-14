class Solution {
    public int findMin(int[] nums) {
int mid=0;
int first=0; int last=nums.length-1;
while(first<=last){

     mid=(first+last)/2;
    if(nums[mid]>=nums[last]){
        first=mid+1;//why +1 becse nums[mid]> it means w are going to increser so it can never small becase of>
    }else{
        last=mid;// but it can be small becase >=nums[last]
    }
}
return nums[last];
    }
}
