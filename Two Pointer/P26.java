import java.util.*;

class P26{
    public int removeDuplicates(int nums[]){
        int slow = 0;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String args[]){
        P26 obj  = new P26();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicates(nums));
    }
}