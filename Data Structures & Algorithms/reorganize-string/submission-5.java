class Solution {
    public String reorganizeString(String s) {

        PriorityQueue<int[]> priorityQueue =
            new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1])); // need to comapre number 

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
            // int val=ele[1]; dont use it
            ele[1]--;
            stringBuilder.append(key);
            // val--;
            if (prev != null && prev[1] > 0) {
                priorityQueue.offer(prev);
            }
            prev = ele;// need to put nuber in string in crccular fashin not smae chartcter gian and again
        }
        return stringBuilder.length() == s.length() ? stringBuilder.toString() : "" ;
    }
}
//https://www.youtube.com/watch?v=D_jE64CJ5UE