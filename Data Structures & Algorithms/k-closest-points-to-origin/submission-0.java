class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
 PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                (a,b)-> Integer.compare(
                (b[0] * b[0]) + (b[1] * b[1]), (a[0] * a[0]) + (a[1] * a[1])
               ));
                ;

        for (int point[] : points) {
            int square = (point[0] * point[0]) + (point[1] * point[1]);
            priorityQueue.offer(new int[]{square, point[0], point[1]});
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }


        }
        int[][] result = new int[k][2];
       int i=0;
        for (int[] point : priorityQueue) {

                 result[i][0]=   point[1];
                  result[i][1]=   point[2];
                  i++;

            }


        return result;
    }
}
