class Solution {
    public void reverseString(char[] s) {
         int c = 0;
        for (int i = s.length-1; i >=( (s.length)/2); i--) {
            char temp=s[i];
               s[i]=s[c];
               s[c]=temp;
               c++;
        }
           
    }
}