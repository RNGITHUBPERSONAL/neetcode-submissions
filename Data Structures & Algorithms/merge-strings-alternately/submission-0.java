class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first = 0, last = 0;
        StringBuilder newString = new StringBuilder();

        while (first < word1.length() && last < word2.length()) {
            newString.append(word1.charAt(first)).append((word2.charAt(last)));

            first++;
            last++;
        }
   if(first<word1.length()){
           newString.append(word1.substring(first,word1.length()));
       }

        if(last<word2.length()){
            newString.append(word2.substring(last,word2.length()));
        }
        return new String(newString);
    }
}