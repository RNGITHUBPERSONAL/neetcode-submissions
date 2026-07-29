class Solution {
  public String reorganizeString(String s) {
    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
    HashMap<Character, Integer> hashMap = new HashMap<>();

    for (char c : s.toCharArray()) {
      hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
    }

    for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
      priorityQueue.offer(new int[] {entry.getKey(), entry.getValue()});
    }
    int[] temp = priorityQueue.poll();
    temp[1]--;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append((char) temp[0]);

    while (!priorityQueue.isEmpty()) {
      int[] cur = priorityQueue.poll();
      stringBuilder.append((char) cur[0]);
      cur[1]--;
      if (temp[1] > 0) {
        priorityQueue.offer(temp);
       
      }
        temp=cur;
    }

    return stringBuilder.length() == s.length() ? stringBuilder.toString() : "";
  }
}