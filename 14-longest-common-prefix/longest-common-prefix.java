class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        String res= "";
        for(int i=0;i<strs[0].length();i++){
            char curr_ele=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length())return res;
                if(curr_ele==strs[j].charAt(i))continue;
                else return res;
            }
            res+=curr_ele;
        }
     
        return res;
    }
}