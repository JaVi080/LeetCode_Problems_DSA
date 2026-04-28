class Remove_duplicate_Sorted_array{
public int removeDuplicates(int[] nums) {
    HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i])
        }
        int k=set.length;
        return k;
    }
    public static void main(String[ arg]){

    }
}