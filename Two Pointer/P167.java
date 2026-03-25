import java.util.*;

public class P167{
    public int[] twoSum(int[] numbers, int target){
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int[] numbers = {2,7,11,15};
        int target = 9;

        P167 obj = new P167();
        System.out.println(Arrays.toString(obj.twoSum(numbers, target)));
    }
}