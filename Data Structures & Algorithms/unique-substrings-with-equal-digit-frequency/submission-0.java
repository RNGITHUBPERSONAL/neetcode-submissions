class Solution {
  public int equalDigitFrequency(String s) {
    Set<String> set = new HashSet<>();

    for (int i = 0; i < s.length(); i++) {
      int fre[] = new int[10];
      for (int j = i; j < s.length(); j++) {
        char ch = s.charAt(j);
        fre[ch - '0']++;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int freq : fre) {
          if (freq > 0) {
            max = Math.max(freq, max);
            min = Math.min(freq, min);
          }
        }
        if (min == max) {
          set.add(s.substring(i, j + 1));
        }
      }
    }
    return set.size();
  }
}

// Think of the rule this way:
// - One distinct digit → Always valid.
// - Two or more distinct digits → Every digit must occur equally often.