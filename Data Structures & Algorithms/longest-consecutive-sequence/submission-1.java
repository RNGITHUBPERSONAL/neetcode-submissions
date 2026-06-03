class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>hash= new HashSet<>();




        for(int i:nums){
            hash.add(i);
        }



        int max=0;

 int count=0;
        for(int i=0;i<nums.length;i++){

            if(!hash.contains(nums[i]-1)){

                int val=nums[i];
                    while(hash.contains(val)){

                        count++;
                        val=val+1;
                    }
              
                max=Math.max(count,max);
                   
            }
             count=0;
        }
        return max;
    }
}
