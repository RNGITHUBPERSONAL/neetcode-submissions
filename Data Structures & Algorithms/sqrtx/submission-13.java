class Solution {
    public int mySqrt(int x) {
     int start =1;int end=x; 

       while(start<=end){
           int mid= start+(end-start)/2;
     long square = (long) mid * mid;
    long nextSquare = (long) (mid + 1) * (mid + 1);

           if( square == x){
               return mid;
           } else if (square>x) {
             end=mid-1;

           }else if (square<x && (long) nextSquare>x ) {
              return mid;
           }

           else {
               start=mid+1;
           }
       }
       return 0;
    }
}