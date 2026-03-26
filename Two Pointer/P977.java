import java.util.*;

public class P977{
    public int[] sortedSquares(int num[]){

        int[] result = new int[num.length];

        int left = 0;
        int right = num.length-1;
        int k = num.length-1;

        while(left <= right){
            int leftSq = num[left] * num[left];
            int rightSq = num[right] * num[right];

            if(leftSq > rightSq){
                result[k] = leftSq;
                left++;
            }
            else{
                result[k] = rightSq;
                right--;
            }
            k--;
        }
        return result;
    }
    public static void main(String args[]){
        int num[] = {-4,-1,0,3,10};
        P977 obj = new P977();
        System.out.println(Arrays.toString(obj.sortedSquares(num)));
    }
}