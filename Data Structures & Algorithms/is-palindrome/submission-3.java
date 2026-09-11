class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder= new StringBuilder();

 for(int i=0;i<s.length();i++){
     if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 || (s.charAt(i) >= 48 && s.charAt(i) <= 57)){
         stringBuilder.append(s.charAt(i));
     }
 }
  String original = stringBuilder.toString();
     return stringBuilder.reverse().toString().equalsIgnoreCase(original);

    }
}
