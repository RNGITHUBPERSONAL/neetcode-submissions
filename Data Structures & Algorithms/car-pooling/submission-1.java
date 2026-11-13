class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < trips.length; i++) {
            int currTripStartPoint = trips[i][1];
            int currPassenger = trips[i][0];
            for (int j = 0; j < i; j++) {
                int prevTripDropPoint = trips[j][2];
                int lastTripPassenger = trips[j][0];
                if (currTripStartPoint < prevTripDropPoint) {
                    currPassenger = lastTripPassenger + currPassenger;
                }
            }
            if (currPassenger > capacity) {
                return false;
            }
        }

        return true;
    }
}