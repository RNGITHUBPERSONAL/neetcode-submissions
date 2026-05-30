class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              HashMap<String,List<String>>res= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char [] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String sort= new String(ch);
            if(res.containsKey(sort)){
               List<String> data= res.get(sort);
               data.add(strs[i]);

            }else {
                res.put(sort,new ArrayList<>(Collections.singleton(strs[i])));
            }



        }

List<List<String>>ans= new ArrayList<>();

for(String str:res.keySet()){
   List<String>data= res.get(str);
    ans.add(data);
}
return   ans;
    }
}
