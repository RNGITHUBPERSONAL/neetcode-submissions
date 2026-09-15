class Solution {
    public int longestConsecutive(int[] nums) {
            HashSet<Integer>hashSet= new HashSet<>();
            if(nums.length==0) return 0;
        int count=0;
      
        
      Arrays.stream(nums).mapToObj(data->hashSet.add(data)).collect(Collectors.toList());
        
        int max=-1;
        
        for(int num:nums) {
                if(!hashSet.contains(num-1)){
                    int range=num;
                    while(hashSet.contains(range)){
                        count++;   
                        range=range+1;
                    }
                    max=Math.max(max,count);
                    count=0;
                    
                }
        }
        return max;
    }
}
