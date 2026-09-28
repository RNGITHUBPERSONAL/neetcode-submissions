class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        int s1len = s1.length();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();

   for (int i = 0; s1len <= s2.length(); i ++) {
            String sub = s2.substring(i, s1len);
            s1len++;
            for (char ch : sub.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }
            if (map1.equals(map)) {
                return true;
            }
            map1 = new HashMap<>();
        }
        return false;
    }
}
