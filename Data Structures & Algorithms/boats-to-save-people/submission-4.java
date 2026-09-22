class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int count = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                count++;
                left++;
                right--;
            } else {
                count++;
                right--;
            }
        }
        return count;
    }
}
///people = [1,2,2,3,3], limit = 3   why right minus if we just found only heviest , so. we need to minus right side