import java.io.*;
class P724{
    
    public int pivotIndex(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int total = prefix[nums.length - 1];
        for(int i = 1; i < nums.length; i++){
            int left = (i==0) ? 0 : prefix[i-1];
            int right = total - prefix[i];

            if(left == right){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {1,7,3,6,5,6};
        P724 obj  = new P724();
        System.out.println(obj.pivotIndex(nums));
    }
}