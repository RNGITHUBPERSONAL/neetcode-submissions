class Solution {
  public boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;//abbadc

    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        boolean isTrue1 = isPalindorm(s, left, right - 1);
        boolean isTrue2 = isPalindorm(s, left + 1, right);
        boolean result = isTrue1 || isTrue2;
        return result;
      }

      left++;
      right--;
    }
    return true;
  }

  private static boolean isPalindorm(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}