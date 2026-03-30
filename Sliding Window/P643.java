import java.util.*;
class P643{
    public double findMaxAverage(int[] nums, int k){
        int sum=0;

        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }

        int maxSum = sum;

        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return (double)maxSum/k;

    }
    public static void main(String args[]){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        P643 obj = new P643();
        System.out.println(obj.findMaxAverage(nums,k));
    }
}