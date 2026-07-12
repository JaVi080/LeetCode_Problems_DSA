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
        for(int[] i : grid){
            //binary approach now 
            int left=0;
            int right=i.length-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(i[mid]>=0)left=mid+1;
                else if(i[mid]<0)right=mid-1;
            }
           count+=i.length-left;
        }
return count;
    }
}