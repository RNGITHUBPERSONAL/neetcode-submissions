class Solution {
    public int minEatingSpeed(int[] piles, int h) {
              int totalTime=0;
        int eatingSpeed=1;int res=0;
        int max= Arrays.stream(piles).max().getAsInt();
        int left=0;int right=max;
      while(left<=right){
          int mid=(left+right)/2; //eating spped of banana per hour
int totaltime=0;
          for(int pile:piles){
              totaltime= (int) (totaltime+Math.ceil((double) pile / mid));

          }
          if(totaltime>h){
              left=mid+1;
          }else{
            res=mid;
              right=mid-1;
          }
      }  
return res;
    }
}
