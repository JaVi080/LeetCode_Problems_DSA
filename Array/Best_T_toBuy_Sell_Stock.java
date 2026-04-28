import java.util.Collections;
import java.util.HashSet;

class Best_T_toBuy_Sell_Stock {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int Prof=0;
                if(prices[j]-prices[i]>=0){
                     maxProf=Math.max(maxProf,prices[j]-prices[i]);
            }
                }
        }
        return maxProf;
    }
       public int Profit(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
      for(int num:nums){
        if(min>num){
            min=num;
            max=num;
        }else if(max<num)max=num;
        set.add(max-min);
      }
     int maxProf=Collections.max(set);
        return maxProf;
    }
    //More Optimized 
    int Stock_Profit(int[] prices){
           int maxProf=0;
        int min=prices[0];
   for(int num:prices){
   min=Math.min(min,num);
   maxProf=Math.max(maxProf,num-min);
      }
        return maxProf;
    }
    public static void main(String[] args) {
       int[] prices = {7,3,5,3,1,4};
       Best_T_toBuy_Sell_Stock stock=new Best_T_toBuy_Sell_Stock();
       int res=stock.Profit(prices);
       System.out.println(res);
    }
}