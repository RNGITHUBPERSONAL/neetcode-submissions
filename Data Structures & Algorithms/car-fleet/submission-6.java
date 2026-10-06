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

//    1, 7, 3

// Step 1
// 1 → Fleet 1

// Step 2
// Now 7 is the car behind the 1 fleet:
// currentTime = 7
// lastFleetTime = 1

// 7 > 1

// So 7 cannot catch Fleet 1.
// Therefore:
// 7 → creates Fleet 2

// Now Fleet 2 contains the car with time 7.
// And this line is important:
// lastFleetTime = 7;

// It means:
// "From now on, the next car behind should compare with the Fleet 2 that has time 7."

// Step 3
// Now 3 is behind the car with time 7:
// currentTime = 3
// lastFleetTime = 7

// 3 <= 7

// So 3 can catch the car/fleet with time 7.
// Therefore:
// Fleet 1 → [1]
// Fleet 2 → [7, 3]

// So yes, 3 joins the same fleet where 7 was.