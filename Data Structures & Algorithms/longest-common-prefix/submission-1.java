class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        StringBuilder str = new StringBuilder("");
        while (i < first.length()) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                str.append(first.charAt(i));
            }
            i++;
        }
        return new String(str); 
    }
}