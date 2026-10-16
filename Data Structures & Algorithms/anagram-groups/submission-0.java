class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs == null || strs.length == 0 ) return null;
       
       Map<String , List<String>> set = new HashMap<>();
       List<List<String>> result = new ArrayList<>();
       for(int i = 0 ; i < strs.length ; i++){
         char[] schar = strs[i].toCharArray();
         Arrays.sort(schar);
         String s = new String(schar);
         if(set.containsKey(s)){
            set.get(s).add(strs[i]);
         }else{
            set.put(s , new ArrayList<>());
            set.get(s).add(strs[i]);
         }
       
       }

       for(String str : set.keySet()){
       result.add(set.get(str));
       
       }

     return result;

    }
}
