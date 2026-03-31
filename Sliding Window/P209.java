import java.util.*;
class P209{
    public int minSubArrayLen(int[] nums, int k){
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum+= nums[right];

            while(sum >= k){
                minLen = Math.min(minLen, right - left + 1);
                sum-= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String args[]){
        int[] nums = {2,3,1,2,4,3};
        int k = 7;
        P209 obj = new P209();
        System.out.println(obj.minSubArrayLen(nums,k));
    }
}