import java.util.*;
class P27{
    public int removeElement(int nums[], int target){
        int slow = 0,count = 0;
        int fast = nums.length-1;
        while(slow < fast){
            if(nums[slow] != target){
                count++;
            }
            if(nums[fast] != target){
                count++;
            }
            slow++;
            fast--;
        }
        return count;
    }
    public static void main(String args[]){
        P27 obj  = new P27();
        int nums[] = {3,2,2,3};
        int target = 3;
        System.out.println(obj.removeElement(nums, target));
    }
}