class TimeMap {
     static class Pair {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
 Map<String, List<Pair>> map;

    public TimeMap() {
       map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
                 List<Pair> existingList= map.get(key);
                Pair newPair= new Pair(timestamp,value);
                existingList.add(newPair);
                map.put(key,existingList);
            }else {
                Pair pair= new Pair(timestamp,value);
                ArrayList<Pair> arrayList= new ArrayList<>();
                arrayList.add(pair);
                map.put(key,arrayList);
            }
    }

    public String get(String key, int timestamp) {

      String track="";
              if(map.containsKey(key)){
                  List<Pair> existingList= map.get(key);


                     for(Pair pair:existingList){
                        //1>0  returning foo but need "
                        if(pair.timestamp==timestamp){
                            return pair.value;
                        }
                       else if(pair.timestamp>timestamp){
                        return track;

                        }else {
                            track=pair.value;
                        }
                    }
                }


             return track;

        
    }
}
