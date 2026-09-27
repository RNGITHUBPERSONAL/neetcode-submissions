class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;

        int highestFreq = 0;
        int max = -1;
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            int freq = map.get(s.charAt(right));

            highestFreq = Math.max(highestFreq, freq);
            while ((right - left + 1) - highestFreq > k) {
                int count = map.get(s.charAt(left));
                count--;
                map.put(s.charAt(left), count);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
// cas-1    dont use window varibel
// int window = right - left + 1;
// while (window - highestFreq > k)

// The problem is that left changes inside the while, but window doesn't, so window becomes outdated
// if the loop runs multiple times.

// That's why we changed it to:

// while ((right - left + 1) - highestFreq > k)

// so the current window size is recalculated every time.
// case-2 why we need max
// For max, we need to keep the largest valid window length seen so far.

// max = Math.max(max, right - left + 1);

// Because right - left + 1 is only the current window size. After left moves, the current window
// can become smaller, so we need max to remember the largest window we had earlier.