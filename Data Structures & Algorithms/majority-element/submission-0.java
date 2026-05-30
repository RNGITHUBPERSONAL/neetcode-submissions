class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer,Integer>hashMap= new HashMap<>();

       for(int i=0;i<nums.length;i++){

           hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            }
var val=0;int res=0;
        for(int key:hashMap.keySet()){

            if(val<hashMap.get(key)){
                val=hashMap.get(key);
                 res=key;
        }



    }
    return res;  
    }
}