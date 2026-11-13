class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        // Sort all trips by their pickup location in ascending order
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));

        // Consider each trip as the current trip
        for (int i = 0; i < trips.length; i++) {

            // Get the pickup location of the current trip
            int currTripStartPoint = trips[i][1];

            // Get the number of passengers in the current trip
            int currPassenger = trips[i][0];

            // Check all previous trips to see if their passengers are still in the car
            for (int j = 0; j < i; j++) {

                // Get the drop-off location of the previous trip
                int prevTripDropPoint = trips[j][2];

                // Get the number of passengers from the previous trip
                int lastTripPassenger = trips[j][0];

                // Check whether previous passengers are still in the car
                if (currTripStartPoint < prevTripDropPoint) {

                    // Add previous passengers to the current passenger count
                    currPassenger = lastTripPassenger + currPassenger;
                }
            }

            // If the total passengers exceed the car capacity, return false
            if (currPassenger > capacity) {
                return false;
            }
        }

        // All trips can be completed without exceeding capacity
        return true;
    }
}