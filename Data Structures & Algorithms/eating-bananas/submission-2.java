class Solution {
    public int minEatingSpeed(int[] piles, int h) {
 int maxpile = 0;int validTime=0;
        for (int i = 0; i < piles.length; i++) {
            maxpile = Math.max(maxpile, piles[i]);
        }
         int first=1; int last=maxpile; int  eatingCompleteBananaTime=0;
         while (first<=last){
             eatingCompleteBananaTime=0;
             int eatingBananaSpeedPer1Hour=(first+last)/2;
             for(int j=0;j<piles.length;j++){
                 eatingCompleteBananaTime=eatingCompleteBananaTime+ (int)Math.ceil((double)   piles[j]/eatingBananaSpeedPer1Hour);
             }
             if(eatingCompleteBananaTime<=h){
                 //need minimum speed,slow down speed
                 validTime=eatingBananaSpeedPer1Hour;
                 last=eatingBananaSpeedPer1Hour-1;
             }else {
                 //not completed eating under specifc hrs,lets bring under into soecifc hrs
                 first=eatingBananaSpeedPer1Hour+1;

             }
         }
         return validTime;
    }
}
