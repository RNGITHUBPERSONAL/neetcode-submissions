class WordDistance {
  WordDistance wordDistance = null;
  HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
  public WordDistance(String[] wordsDict) {
    for (int i = 0; i < wordsDict.length; i++) {
      if (hashMap.containsKey(wordsDict[i])) {
        ArrayList<Integer> arrayList = hashMap.get(wordsDict[i]);
        arrayList.add(i);
      } else {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(i);
        hashMap.put(wordsDict[i], arrayList);
      }
    }
  }

  public int shortest(String word1, String word2) {
    int min = 9999;
    int i = 0;
    int j = 0;

    ArrayList<Integer> wrd1 = hashMap.get(word1);
    ArrayList<Integer> wrd2 = hashMap.get(word2);

    while (i <wrd1.size() && j < wrd2.size()) {
      int first = wrd1.get(i);

      int sec = wrd2.get(j);

      min = Math.min(min, Math.abs(first - sec));
      if (first < sec) {
        i++;
      } else {
        j++;
      }
    }
    return min;
  }
}

// wrd1 = [1, 4, 6, 7] wrd2 = [3, 5] it means you move i becae as j=3 and i =1 so theras is chace i
// might get in btween 1 to 3