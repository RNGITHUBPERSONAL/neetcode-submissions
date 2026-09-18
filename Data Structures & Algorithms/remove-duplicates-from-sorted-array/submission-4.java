class Solution {
    public int removeDuplicates(int[] nums) {
         HashSet<Integer>hashSet= new LinkedHashSet<>();
      HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
        hashSet.add(num);
    }

    int i = 0;

    for (int num : hashSet) {
        nums[i] = num;
        i++;
    }
return hashSet.size() ;
    }
}