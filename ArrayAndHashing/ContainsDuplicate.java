
import java.util.HashMap;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    HashMap<Integer,Boolean> hashmap=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(hashmap.containsKey(nums[i])){
            System.out.println("hey here");
            return true;
        }
        hashmap.put(nums[i],false);
    }
    return false;
    }
}
