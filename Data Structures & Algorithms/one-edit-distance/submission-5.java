class Solution {
  public boolean isOneEditDistance(String s, String t) {
    int sLength = s.length();
    int tLength = t.length();
    if (Math.abs(s.length() - t.length()) > 1) {
      return false;
    }

    // Case 1: Replace exactly one character
    if (sLength == tLength) {
      int count = 0;

      for (int i = 0; i < sLength; i++) {
        if (s.charAt(i) != t.charAt(i)) {
          count++;

          if (count > 1) {
            return false;
          }
        }
      }

      return count == 1;
    }
// s = "abc"
// t = "abxc"

// s = "abxc"
// t = "abc"
    int count = 0;
    int start = 0;
    int fast = 0;
    //why we need alter becase insted of delte we can just reverse so it can handel it in addit
if(s.length()>t.length()){
String temp=s;
s=t;
t=temp;

}

    while (start < s.length() && fast < t.length()) {
  

      if (s.charAt(start) == t.charAt(fast)) {
        start++;
        fast++;
      } else {
        count++;
        fast++;

        if (count > 1) {
          return false;
        }
      }
    }

    return true;
  }
}
