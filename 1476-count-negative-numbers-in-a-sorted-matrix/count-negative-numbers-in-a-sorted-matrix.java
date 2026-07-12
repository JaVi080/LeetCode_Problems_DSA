class Solution {
    public int countNegatives(int[][] grid) {
        // int count=0;
        // for(int[] i : grid){
        //     for(int num: i){
        //         if(num<0)count++;
        //     }
        // }
        // return count;

        //lets optimize
        int count=0;
     int row_l=grid[0].length;
        int lastNeg=row_l-1;
        for(int i=0;i<grid.length;i++){ //i is current row
            //binary approach now O(m log n)
            //handling edge cases
            if(grid[i][0]<0){
                count+=row_l;
                continue;
            }
            if(grid[i][row_l-1]>0)continue;

            int left=0;
            int right=lastNeg;
            
            while(left<=right){
                int mid=left+(right-left)/2;
                if(grid[i][mid]>=0)left=mid+1;
                else if(grid[i][mid]<0)right=mid-1;
            }
           count+=row_l-left;
           lastNeg=left; //optimization
        }
return count;
    }
}