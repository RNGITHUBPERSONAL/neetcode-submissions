class Solution {
    public int lengthOfLastWord(String s) {
    
        String []len=s.split(" ");
int num= len[len.length-1].length();
return num;    
    }
}