class Solution {
    public String longestDiverseString(int a, int b, int c) {
     HashMap<Character, Integer> hashMap = new HashMap<>();

        if (a > 0) {
            hashMap.put('a', a);
        }

        if (b > 0) {
            hashMap.put('b', b);
        }

        if (c > 0) {
            hashMap.put('c', c);
        }
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((p, q) -> Integer.compare(q[1], p[1]));

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            priorityQueue.offer(new int[] {entry.getKey(), entry.getValue()});
        }

StringBuilder stringBuilder = new StringBuilder();
        while(!priorityQueue.isEmpty()){
            int first[]=priorityQueue.poll();

            if(stringBuilder.length()>=2 && stringBuilder.charAt(stringBuilder.length()-1)==first[0] && stringBuilder.charAt(stringBuilder.length()-2)==first[0]){
                if (priorityQueue.isEmpty()) {//a = 3 b = 0 c = 0
                    break;
                }
                int sec[]=priorityQueue.poll();
                stringBuilder.append((char)sec[0]);
                sec[1]--;
                if(sec[1]>0){
                    priorityQueue.offer(sec);
                }
                priorityQueue.offer(first);//a = 5 b = 2 c = 0
            }else {
                stringBuilder.append((char)first[0]);
                first[1]--;
                if(first[1]>0){
                    priorityQueue.offer(first);
                }
            }

        }

    
        return stringBuilder.toString();
    }
}