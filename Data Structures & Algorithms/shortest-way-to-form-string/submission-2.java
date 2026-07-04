class Solution {
  public int shortestWay(String source, String target) {
    int j = 0; // abcd abc
    int count = 0;
    while (j < target.length()) {
      int start = j;
      for (int i = 0; i < source.length(); i++) {
        if (j<target.length() && source.charAt(i) == target.charAt(j)) {
          j++;
        }
      }
      if (start == j) {
        return -1;
      }
      count++;
    }
    return count;
  }
}