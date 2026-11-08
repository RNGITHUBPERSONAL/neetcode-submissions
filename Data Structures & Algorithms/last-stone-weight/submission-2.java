class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> prtq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int stone : stones) {
            prtq.offer(stone);
        }
        int count = 0;
        while (!prtq.isEmpty() && prtq.size() > 1) {
            int first = prtq.poll();
            int last = prtq.poll();
            int sol = first - last;
            if (sol != 0) {
                prtq.offer(sol);
            }
        }
            if (prtq.size() > 0)
                return prtq.peek();
            return 0;
        
    }
}
