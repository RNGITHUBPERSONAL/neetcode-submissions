class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int left = 0;
        int res = 0;

        for (int right = 0; right < nums.length; right++) {
            minHeap.offer(new int[] {nums[right], right});
            maxHeap.offer(new int[] {nums[right], right});

            while (maxHeap.peek()[0] - minHeap.peek()[0] > limit) { // why while 4,5,1,6,20

                left++;
                while (!minHeap.isEmpty() && minHeap.peek()[1] < left) {
                    minHeap.poll();
                }
                while (!maxHeap.isEmpty() && maxHeap.peek()[1] < left) {
                    maxHeap.poll();
                }
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}