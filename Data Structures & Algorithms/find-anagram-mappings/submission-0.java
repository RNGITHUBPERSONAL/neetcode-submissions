class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int res[]= new int[nums2.length];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums2.length;i++) {

    hashMap.put(nums2[i],i);
}

        for(int i=0;i<nums1.length;i++) {

          if(hashMap.containsKey(nums1[i])) {
           res[i]= hashMap.get(nums1[i]);
          }


}
return res; 
    }
}
