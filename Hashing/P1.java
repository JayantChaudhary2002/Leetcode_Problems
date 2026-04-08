import java.util.*;
class P1{
    public int[] twoSum(int nums[], int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int component = target - nums[i];

            if(map.containsKey(component)){
                return new int[]{map.get(component), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        P1 obj = new P1();
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}