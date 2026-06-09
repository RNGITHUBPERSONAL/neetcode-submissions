class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int num : hashSet) {
            nums[count] = num;
            count++;
        }
        return hashSet.size();
    }
}