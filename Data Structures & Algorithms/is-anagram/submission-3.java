class Solution {
    public boolean isAnagram(String s, String t) {
        int[] size = new int[26];
        int[] size1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            size[ch]++;
        }//0,0,0,0
        for (int i = 0; i < t.length(); i++) {
            int ch = t.charAt(i) - 'a';
            size1[ch]++;
        }
        for (int i = 0; i < 26; i++) {
            if (size[i] != size1[i]) {
                return false;
            }
        }
        return true;
    }
}
