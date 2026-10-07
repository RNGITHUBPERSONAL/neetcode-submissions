class Solution {
    public int mySqrt(int x) {
        long mul=1;
       for(int i=0;i<=x;i++){
           mul=i;
           mul=mul*mul;
           if(mul==x){
         return      i;
           }else if(mul>x){
            return   i-1;
           }
       }
       return 1;
    }
}