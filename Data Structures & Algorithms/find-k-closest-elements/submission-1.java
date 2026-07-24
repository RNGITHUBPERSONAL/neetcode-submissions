class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(

            (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(b[0], a[0]);
                }
                return Integer.compare(b[1], a[1]);
            });

        for (int num : arr) {
            priorityQueue.offer(new int[] {Math.abs(num - x), num});
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int[] num : priorityQueue) {
            int val = num[1];

            arrayList.add(val);
        }
        Collections.sort(arrayList);

        return arrayList;
    }
}