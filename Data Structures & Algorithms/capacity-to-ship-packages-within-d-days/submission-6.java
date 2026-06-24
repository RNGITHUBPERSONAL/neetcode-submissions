class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = -999999;
        int sum = 0;
        int result = 99999;
        int total = 0;
        int capacityPerDays = 0, capacityPerDayss = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(weights[i], max);
            sum = sum + weights[i];
        }

        while (max <= sum) {
            int cpacity=(max+sum)/2;
          

            for (int i = 0; i < weights.length; i++) {
                total = total + weights[i];
                if (cpacity >= total) {
                    continue;

                } else {
                    total = weights[i];
                    capacityPerDays++;
                }
            }
            capacityPerDays++;
            
            if (capacityPerDays <= days) {
                sum=cpacity-1;
                if (result > cpacity) {
                    result = cpacity;
                }
            }else{
               
                max=cpacity+1;
            }
            capacityPerDays = 0;
           
            total = 0;
        }
        return result;
    }
}