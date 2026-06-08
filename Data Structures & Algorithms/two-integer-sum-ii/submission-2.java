class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for(int j=i+1;j<numbers.length;j++){
                if (i != j) {
                    sum = sum + numbers[i] + numbers[j];

                    if (sum == target) {
                        return new int[]{i+1,j+1};
                    }
                    sum=0;
                }
            }
        }
         return new int[]{0,0};
    }
}
