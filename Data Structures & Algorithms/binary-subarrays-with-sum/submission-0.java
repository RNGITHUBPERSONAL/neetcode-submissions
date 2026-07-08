class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int prefixSum=0;int count=0;
        HashMap<Integer,Integer>hashMap= new HashMap<>();
        hashMap.put(0,1);
for(int i=0;i<nums.length;i++){




    prefixSum=prefixSum+nums[i];
    if(hashMap.containsKey(prefixSum-goal)){

        count=count+hashMap.get(prefixSum-goal);

    }
        hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum,0)+1);



} 
return count;
    }
}