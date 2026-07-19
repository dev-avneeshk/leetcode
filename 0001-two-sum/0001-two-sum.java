import java.util.HashMap;
class Solution{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(table.containsKey(comp)){
                return new int[]{table.get(comp), i};
            }
            table.put(nums[i],i);
        }
        return new int[]{};
    }
}