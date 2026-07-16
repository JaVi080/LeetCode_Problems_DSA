class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
       // String res= "";
        //optimize way is to use StringBuilder 
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char curr_ele=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length())return res.toString();
                if(curr_ele==strs[j].charAt(i))continue;
                else return res.toString();
            }
           // res+=curr_ele; it will create new String everytime
           res.append(curr_ele);
        }
     
        return res.toString();
    }
}