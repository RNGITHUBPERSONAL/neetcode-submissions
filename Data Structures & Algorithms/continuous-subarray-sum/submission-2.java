class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int total = 0;
hashMap.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
            int reminder = total % k;

            if (!hashMap.containsKey(reminder)) {
                hashMap.put(reminder, i);
            } else if (i - hashMap.get(reminder) >= 2) {
                return true;
            }
        }

        return false;
    }
}
// 23,1,2,3  6
//  2,1,3,5  6
//  6,0,3,4  6
//3,3       6