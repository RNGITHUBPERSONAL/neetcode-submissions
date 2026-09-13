class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>();
    for (int num : nums) {
      hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
    }

    List<Integer> list = hashMap.entrySet()
                             .stream()
                             .sorted((a, b) -> b.getValue() - a.getValue())
                             .limit(k)
                             .map(a -> a.getKey())
                             .collect(Collectors.toList());
    int[] res = list.stream().mapToInt(a -> a).toArray();
    return res;
  }
}
