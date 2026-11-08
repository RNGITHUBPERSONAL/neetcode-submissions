class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> priorityQueue =
            new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int[] point : points) {
            int mul = (point[0] * point[0]) + (point[1] * point[1]);
            priorityQueue.offer(new int[] {mul, point[0], point[1]});

            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        int i=0;
        int result[][] = new int[k][2]; // row col
        for (int[] pq : priorityQueue) {
            result[i][0] = pq[1];

            result[i][1] = pq[2];
            i++;
        }
        return result;
    }
}
