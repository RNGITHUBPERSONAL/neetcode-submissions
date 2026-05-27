class Solution {
    public int countElements(int[] arr) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;

        for (int key : hashMap.keySet()) {
            if (hashMap.containsKey(key - 1)) {
                count = count + hashMap.get(key - 1);
            }
        }
        return count;
    }
}
