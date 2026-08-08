class Solution {
    public int leastInterval(char[] tasks, int n) {
      Integer[] freq = new Integer[26];

    Arrays.fill(freq, 0);

    for (char task : tasks) {
        freq[task - 'A']++;
    }

    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(b, a));

    for (Integer f : freq) {
        if (f > 0) {
            maxHeap.offer(f);
        }
    }

    PriorityQueue<Integer[]> queue =
            new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

    Integer time = 0;

    while (!maxHeap.isEmpty() || !queue.isEmpty()) {

        time++;

        if (!maxHeap.isEmpty()) {

            Integer frequency = maxHeap.poll();
            Integer remaining = frequency - 1;

            if (remaining > 0) {
                queue.offer(new Integer[]{remaining, time + n});
            }
        }

        if (!queue.isEmpty() && queue.peek()[1].equals(time)) {
            maxHeap.offer(queue.poll()[0]);
        }
    }

    return time;  
    }
}
