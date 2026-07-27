class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int stone : stones) {
            priorityQueue.offer(stone);
        }

        while (priorityQueue.size() > 1) {
            int first = priorityQueue.poll();
            int sec = priorityQueue.poll();

            if (first != sec) {
                priorityQueue.offer(Math.abs(first - sec));
            }
        }

        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }
}
