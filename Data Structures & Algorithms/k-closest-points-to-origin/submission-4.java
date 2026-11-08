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
// PriorityQueue<int[]> priorityQueue =    new PriorityQueue<>(        (a, b) -> Integer.compare(b[0], a[0])    );//priorityQueue.offer(new int[]{10, 1, 3}); here 10 is b[0]

// a is the first array {10, 1, 3}. b is the second array {89, 5, 8}. a[0] is 10. b[0] is 89., so here a[0] and b[0] is enogh because we need to coamre pnly these value