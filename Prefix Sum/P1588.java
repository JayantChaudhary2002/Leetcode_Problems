import java.io.*;
public class P1588{
    public int sumOddLengthSubArrays(int[] arr){
        int n =arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int sum = 0;

        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end = end+2){
                if(start == 0){
                    sum = sum + prefix[0];
                }
                else{
                    sum = sum + prefix[end] - prefix[start-1];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[] arr = {1,4,2,5,3};

        P1588 obj = new P1588();
        System.out.println(obj.sumOddLengthSubArrays(arr));
    }
}