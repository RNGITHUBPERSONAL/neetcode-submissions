class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length()==0) return 0;
        int start = 0;
        int count = 0;
        int max = -1;
        for (char ch : s.toCharArray()) {
            count++;
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
                count--;
            }

            set.add(ch);
            max=Math.max(max,count);
        }
        return max;
    }
}
