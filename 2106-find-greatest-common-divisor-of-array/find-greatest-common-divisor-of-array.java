class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int res=nums[0];
        int max=nums[nums.length-1];
        int min=nums[0];

        while(res>0){
            if(max%res==0&& min%res==0)return res;
            else res--;
        }
        return res;  
    }
}