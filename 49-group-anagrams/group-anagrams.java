class Solution {
      public List<List<String>> groupAnagrams(String[] strs) {
         String[] copy = Arrays.copyOf(strs, strs.length);
        
        HashMap<String,List<String>> map =new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (int i=0;i<copy.length;i++){
             char[] arr = copy[i].toCharArray();
             Arrays.sort(arr);
             copy[i] = new String(arr);
        }
        for(int i=0;i<copy.length;i++){
            if(map.containsKey(copy[i])){
                map.get(copy[i]).add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                 map.put(copy[i],list);
            }
        }

       for (List<String> values : map.values()) {
    result.add(values);  // addAll, not add — because each is a List
}
        
        return result;
    
    }
}