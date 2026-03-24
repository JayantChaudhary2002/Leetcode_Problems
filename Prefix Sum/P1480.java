import java.io.*;
import java.util.*;
public class P1480{
    public int[] runningSum(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        P1480 obj = new P1480();
        System.out.println(Arrays.toString(obj.runningSum(nums)));
    }
}