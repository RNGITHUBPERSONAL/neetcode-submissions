class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
int sum=0;
for(int i=0;i<prices.length-1;i++){

    if(prices[i]>prices[i+1]){

    }else{
         diff=prices[i+1]-prices[i];
        sum=sum+diff;
    }
 

}
return sum;
    }
}