class Solution {
    public boolean validPalindrome(String s) {
        for(int i=0;i<s.length();i++){
    String sub1 = s.substring(0,i);
    String sub2=s.substring(i+1,s.length());
    String newStr=sub1+sub2;
    if(newStr.equals(new StringBuilder(newStr).reverse().toString())){
        return true;
    }
}
return false;
    }
}