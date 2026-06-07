import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//medium prblm 

public class GroupAnagram {
     public List<List<String>> groupAnagrams(String[] strs) {
        //sorted word --> anagram key 
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

// m is the number of strings and  n is the length of the longest string.
     public List<List<String>> groupAnagrams2(String[] strs) { //Time comp : O (m * n log n )
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

    public List<List<String>> groupAnagrams3(String[] strs) { //Time comp : O (m * n )
           Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] freq=new int[26];
            for(char ch : s.toCharArray()){
                freq[ch - 'a']++;
            }
            String key= Arrays.toString(freq);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);

        }
        return new ArrayList<>(res.values());
    }
}
