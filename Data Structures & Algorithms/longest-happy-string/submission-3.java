class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> priorityQueue =
            new PriorityQueue<>((first, last) -> Integer.compare(last[1], first[1]));

        HashMap<Character, Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder("");
        if (a > 0)
            hashMap.put('a', a);
        if (b > 0)
            hashMap.put('b', b);
        if (c > 0)
            hashMap.put('c', c);

        for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
            priorityQueue.offer(new int[] {map.getKey(), map.getValue()});
        }

        while (!priorityQueue.isEmpty()) {
            int[] first = priorityQueue.poll();

            if (stringBuilder.length() >= 2
                && stringBuilder.charAt(stringBuilder.length() - 1) == first[0]
                && stringBuilder.charAt(stringBuilder.length() - 2) == first[0]) {
                     if(priorityQueue.isEmpty()){//a = 0, b = 1, c = 5  ccbcc
                       break;
                    }
                int[] sec = priorityQueue.poll();


                   

                stringBuilder.append((char) sec[0]);
                sec[1]--;
                if (sec[1] > 0) {
                    priorityQueue.offer(sec);
                }
                priorityQueue.offer(first); // first = [a, 3] sec   = [b, 2] resutlt=aa , but you
                                            // canot put a again so thas the reason we need t put b
                                            // back when we have above if condition satisfy
            } else {
                stringBuilder.append((char) first[0]);
                first[1]--;
                if (first[1] > 0) {
                    priorityQueue.offer(first);
                }
            }
        }
        return stringBuilder.toString();
    }
}


//   if(priorityQueue.isEmpty()){//a = 0, b = 1, c = 5  ccbcc
//                         return;
//                     }
// Iteration 6:
// - Poll c(1).
// - Last two characters are cc.
// - The if condition is true.
// - But the heap is empty, so sec is null.
// - This is where your NullPointerException occurs.