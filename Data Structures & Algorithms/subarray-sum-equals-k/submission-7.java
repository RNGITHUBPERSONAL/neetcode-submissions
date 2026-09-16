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
// 1. Calculate current prefix sum
// 2. Calculate: current prefix sum - k
// 3. This tells us WHICH previous prefix sum we need
// 4. Check that key in the HashMap
// 5. Its VALUE tells us how many times that prefix sum appeared
// 6. Add that value to count
// 7. Store the current prefix sum

//  if (hashMap.containsKey(sum - k)) {
//                 int val = hashMap.get(sum - k);
//                 count = count + val;
//             }
//               sum = sum + nums[i];
// above logic is wrong,becase,At each iteration, sum needs to represent the current prefix sum before you calculate: