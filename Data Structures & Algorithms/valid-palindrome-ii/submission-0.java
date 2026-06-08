class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int last = s.length();

        while (start < last) {
            String news = s.substring(0,start)+s.substring(start+1);
            boolean isTrue = checkPalindrom(news);
            if (isTrue) {
                return true;
            }
            start++;
        }
        return false;
    }

    static boolean checkPalindrom(String news) {
        StringBuilder newString = new StringBuilder(news).reverse();
        return newString.toString().equalsIgnoreCase(news);
    }
}