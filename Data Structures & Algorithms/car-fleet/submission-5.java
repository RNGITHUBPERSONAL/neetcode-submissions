class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] nums = new double[position.length][2];

        for (int i = 0; i < position.length; i++) {
            nums[i][0] = position[i];
            nums[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort(nums, (a, b) -> Double.compare(b[0], a[0]));

        int fleet = 0;
        double lastFleetTime = 0;

        // 1,7,3

        for (int i = 0; i < nums.length; i++) {
            double curentTime = nums[i][1];
            if (curentTime > lastFleetTime) {
                fleet++;
                lastFleetTime = curentTime;
            }
        }
            return fleet;
        }
    }

    // Previously, I thought we could group cars just by having the same time, but that is wrong
    // because position also plays a vital role. For example, if Car A has time 3 and position 2,
    // and Car B has time 6 and position 5, Car A is behind B and can catch it, so they form one
    // fleet.

    // We sort by position, not because a higher position guarantees less time.
    // We sort by position because we need to know:
    // Which car is ahead and which car is behind.

    // Then the time tells us whether the behind car can catch the ahead car.
    // Example:
    // Position 5 → time 7   ← ahead
    // Position 3 → time 3   ← behind

    // Because:
    // 3 < 7

    // the behind car can catch the ahead car → same fleet.
    // So remember:
    // POSITION → who is ahead / behind
    // TIME     → can the behind car catch the ahead car?

    // Also, a higher position does NOT mean higher/lower arrival time automatically. Speed can make
    // the time anything.
