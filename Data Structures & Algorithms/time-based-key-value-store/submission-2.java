class TimeMap {
  Map<String, List<Pair>> pairs = null;
  class Pair {
    int timeStamp;
    String value;
    Pair(String value, int timeStamp) {
      this.timeStamp = timeStamp;
      this.value = value;
    }
  }
  public TimeMap() {
    pairs = new HashMap<>();
  }

  public void set(String key, String value, int timestamp) {
    if (!pairs.isEmpty() && pairs.containsKey(key)) {
      List<Pair> val = pairs.get(key);
      val.add(new Pair(value, timestamp));
    } else {
      List<Pair> list = new ArrayList<>();
      list.add(new Pair(value, timestamp));
      pairs.put(key, list);
    }
  }

  public String get(String key, int timestamp) {
    String res="";
    if (! pairs.containsKey(key)){
      return "";
    }
    if (!pairs.isEmpty() && pairs.containsKey(key)) { 
      List<Pair> val = pairs.get(key);
      for (Pair p : val) {
        if (timestamp >= p.timeStamp) {
          res=p.value;
        }else{
          break;
        }
      }
    }
     return res;
  }
}
