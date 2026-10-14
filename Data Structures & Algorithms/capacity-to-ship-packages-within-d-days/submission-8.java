class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;

        for (int weight : weights) {
            max = Math.max(max, weight);
            sum += weight;
        }

        for (int capacity = max; capacity <= sum; capacity++) {
            int increaseDay = 0;
            int currentLoad = 0;

            for (int weight : weights) {
                currentLoad = currentLoad + weight;

                if (currentLoad <= capacity) {
                    continue;
                } else {
                    increaseDay++;
                    currentLoad = weight;
                }
            }

            increaseDay++;

            if (increaseDay <= days) {
                return capacity;
            }
        }
        return 0;
    }
}