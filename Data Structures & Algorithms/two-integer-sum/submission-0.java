class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hashMapa= new HashMap<>();
     int ans[]=new int[2];          
        for(int i=0;i<nums.length;i++){

if(hashMapa.containsKey(target-nums[i])){

   
    int ndAns=hashMapa.get(target-nums[i]);
  
   ans[0]=ndAns;
    ans[1]=i;
   break;
}
            hashMapa.put(nums[i],i);
        }

return ans;

  
    }
}
