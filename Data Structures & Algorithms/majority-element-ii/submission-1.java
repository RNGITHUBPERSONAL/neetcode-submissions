class Solution {
    public List<Integer> majorityElement(int[] nums) {
            int range=nums.length/3;
HashMap<Integer,Integer>hashMap= new HashMap<>();
        for(int num:nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
List<Integer>list=hashMap.entrySet().stream().filter(a->a.getValue()>range).map(a->a.getKey()).collect(Collectors.toList());
return list;
    }
}