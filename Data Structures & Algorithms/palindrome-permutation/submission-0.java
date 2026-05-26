class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c1 : s.toCharArray()) {
            hashMap.put(c1, hashMap.getOrDefault(c1, 0) + 1);
        }

        int count = 0;
        for (char key : hashMap.keySet()) {
            int val = hashMap.get(key);
            if (val % 2 == 1) {
                count++;
                if (count > 1) {
                   return false;
                }
            }
        }
        return true;
    }
}
