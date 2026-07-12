class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] i : grid){
            for(int num: i){
                if(num<0)count++;
            }
        }
        return count;
    }
}