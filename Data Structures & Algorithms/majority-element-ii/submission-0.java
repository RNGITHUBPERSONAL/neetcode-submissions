class Solution {
    public List<Integer> majorityElement(int[] nums) {
    int avg= nums.length/3;
List<Integer> list=new ArrayList<Integer>();
HashMap<Integer,Integer>hashMap= new HashMap<>();

    for(int num:nums){
        hashMap.put(num, hashMap.getOrDefault(num,0)+1);
    }

    for(int key:hashMap.keySet()){
        if(hashMap.get(key)>avg){
            list.add(key);
        }
    }
    

return   list; 
    }
}