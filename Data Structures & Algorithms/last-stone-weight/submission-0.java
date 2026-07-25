class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();

        for (int stone : stones) {
            stoneList.add(stone);
        }

        while (stoneList.size() > 1) {
           stoneList.sort(Collections.reverseOrder());
            int first = stoneList.get(0);
            int sec = stoneList.get(1);

            if (first == sec) {
                stoneList.remove(0);
                stoneList.remove(0);

            } else {
                           
 stoneList.add(Math.abs(first - sec));
                stoneList.remove(0);
                stoneList.remove(0);
               
            }
        }

return stoneList.isEmpty() ? 0 : stoneList.get(0);
        
    }
}
