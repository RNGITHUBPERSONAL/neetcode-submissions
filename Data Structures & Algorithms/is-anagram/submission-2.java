class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int[] num1 = new int[26];
        int[] num2 = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        int j = 0;
        int k = 0;
        int val = 0, val1 = 0;
        for (int i = 0; i < ch1.length; i++) {
            j = ch1[i] - 'a';
            if (num1[j] == 0) {
                num1[j] = 1;
            }

            else if (num1[j] != 0) {
                val = num1[j];
                val++;
                num1[j] = val;
            }
            k = ch2[i] - 'a';
            if (num2[k] == 0) {
                num2[k] = 1;
            }

            else if (num2[k] != 0) {
                val1 = num2[k];
                val1++;
                num2[k] = val1;
            }
        }
        for (int i = 0; i < num2.length; i++) {
            if (num1[i] != num2[i]) {
                return false;
            }
        }

        return true;
    }
}
