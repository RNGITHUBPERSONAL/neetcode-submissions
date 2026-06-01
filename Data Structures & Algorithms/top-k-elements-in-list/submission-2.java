class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          List<Integer>[] res= new List[nums.length+1];

        HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
      }

      
      
      
      for(int key:map.keySet()){
          
        int freq= map.get(key);

            if(res[freq]==null){
            res[freq]= new  ArrayList<>();
            }
            res[freq].add(key);
                
      }
int [] ans= new int[k];//0,0
int count=0;
      for(int i=res.length-1;i>=0 && count<k ;i--){
           if(res[i] !=null){
           
           for(Integer in:res[i]){
            ans[count]=in;
            count++;
           }
           }

      }
    return ans;
    }

      
   
}
