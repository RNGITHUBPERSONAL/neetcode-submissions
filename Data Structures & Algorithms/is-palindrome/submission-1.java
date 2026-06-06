class Solution {
    public boolean isPalindrome(String s) {
   
 StringBuffer  stringBuffer=new StringBuffer();
           for(char c:s.toCharArray()){
               if(Character.isAlphabetic(c)|| Character.isDigit(c)){
                   stringBuffer.append(c);
               }
               
           }
      String str=  stringBuffer.toString();

return new String(stringBuffer.reverse()).equalsIgnoreCase(str);
    }
}
