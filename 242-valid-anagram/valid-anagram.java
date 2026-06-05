class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashmap=new HashMap<>();
       // HashMap<Character, Integer> hashmap2=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        if (n1!=n2) return false;
        for (int i=0; i< n1;i++){
            hashmap.put(s.charAt(i),hashmap.getOrDefault(s.charAt(i),0)+1);
            hashmap.put(t.charAt(i),hashmap.getOrDefault(t.charAt(i),0)-1);
        }
        for (int count: hashmap.values()){
            if(count !=0)return false;

        }
        return true;
    }
}