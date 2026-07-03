class Solution {
    public void reverseWords(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++, j--) {
            char tempFirst = s[i];

            s[i] = s[j];
            s[j] = tempFirst;
        }
        int left = 0;
        for (int right = 0; right < s.length; right++) {
            if (s[right] == ' ') {
                reverse(left, right - 1, s);
              

                left = right+1;
            }
        }

  reverse(left, s.length - 1, s);

    }
    //["e","u","l","b"," ","s","i"," ","y","k","s"," ","e","h","t"]
    void reverse(int left, int right, char[] s) {
        while (left <= right) {
            char tempFirst = s[left];

            s[left] = s[right];
            s[right] = tempFirst;
            left++;
            right--;
        }
    }
}
