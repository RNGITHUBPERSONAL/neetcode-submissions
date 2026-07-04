class FirstUnique {
  FirstUnique firstUnique = null;
  LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

  public FirstUnique(int[] nums) {
    for (int num : nums) {
      this.add(num);
    }
  }
public int showFirstUnique() {
    for (int key : map.keySet()) {
        if (map.get(key) == 1) {
            return key;
        }
    }
    return -1;
}


  public void add(int value) {
    map.put(value, map.getOrDefault(value, 0) + 1);
  }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
