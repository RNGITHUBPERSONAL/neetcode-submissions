class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int len = s1.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; len <= s2.length(); i++) {
            String sub = s2.substring(i, len);
            len++;

            for (char ch : sub.toCharArray()) {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            }
            if (map.equals(map1)){
               return true;

        }
            map1 = new HashMap<>();
    }  
    return false;
    }
}
