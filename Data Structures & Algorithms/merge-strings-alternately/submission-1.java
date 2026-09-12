class Solution {
    public String mergeAlternately(String word1, String word2) {
     
    int i = 0;
    int j = 0;

    StringBuilder strBuilder = new StringBuilder();

    while (i < word1.length() && j < word2.length()) {
        strBuilder.append(word1.charAt(i));
        strBuilder.append(word2.charAt(j));

        i++;
        j++;
    }

    // Remaining characters from wd1
    if (i < word1.length()) {
        strBuilder.append(word1.substring(i));
    }

    // Remaining characters from wd2
    if (j < word2.length()) {
        strBuilder.append(word2.substring(j));
    }

    return strBuilder.toString();
    }
}