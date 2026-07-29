class Solution {
    public String reorganizeString(String s) {
            int[] map = new int[26];

    for (int i = 0; i < s.length(); i++) {
        map[s.charAt(i) - 'a']++;
    }

    // arr[0] = character, arr[1] = frequency
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

    for (int i = 0; i < 26; i++) {
        if (map[i] > 0) {
            pq.offer(new int[]{'a' + i, map[i]});
        }
    }

    StringBuilder ans = new StringBuilder();

    int[] block = pq.poll();
    ans.append((char) block[0]);
    block[1]--;

    while (!pq.isEmpty()) {

        int[] temp = pq.poll();

        ans.append((char) temp[0]);
        temp[1]--;

        if (block[1] > 0) {
            pq.offer(block);
        }

        block = temp;
    }

    return ans.length() == s.length() ? ans.toString() : "";
    }
}