class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<int[]> priorityQueue =
            new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            priorityQueue.offer(new int[] {map.getKey(), map.getValue()});
        }

        StringBuilder stringBuilder = new StringBuilder();
        int[] prev = null;
        while (!priorityQueue.isEmpty()) {
            int ele[] = priorityQueue.poll();
            char key = (char) ele[0];
            // int val=ele[1];
            ele[1]--;
            stringBuilder.append(key);
            // val--;
            if (prev != null && prev[1] > 0) {
                priorityQueue.offer(prev);
            }
            prev = ele;
        }
        return stringBuilder.length() == s.length() ? stringBuilder.toString() : "" ;
    }
}