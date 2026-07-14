class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int max = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {

            sum = sum + cardPoints[i];
        }
        max = sum;
        int right = cardPoints.length - 1;
        for (int left = k-1; left < cardPoints.length; left--) {
           
            sum = sum - cardPoints[left];


            sum = sum + cardPoints[right];
            max = Math.max(sum, max);
            right--;
             if (left <= 0) {
                break;
            }
        }
        return max;   
    }
}