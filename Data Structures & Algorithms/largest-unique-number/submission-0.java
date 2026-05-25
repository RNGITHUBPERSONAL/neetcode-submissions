class Solution {
    public int largestUniqueNumber(int[] nums) {
        int max = nums[0], count = 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<nums.length;i++){
          if(!treeSet.add(nums[i])){
              treeSet.remove(nums[i]);
          }

        }
        if(treeSet.isEmpty()) return -1;
        return treeSet.last();
    }
}

