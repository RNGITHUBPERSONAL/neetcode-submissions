class Solution {
    public int scoreOfString(String s) {
              int k=0;int m=0;
       for(int i=0;i<s.length()-1;i++){
           k= Math.abs(s.charAt(i)-s.charAt(i+1));
m=m+k;
       }
return m;
    }
}