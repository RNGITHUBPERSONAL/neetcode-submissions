class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (hashMap.containsKey(sum - k)) {
                int val = hashMap.get(sum - k);
                count = count + val;
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        
    }
    return count;
}
}