import java.util.*;
class P1562{
    public int[] decrypt(int nums[], int k){
        int n = nums.length;
        int[] result = new int[n];
        if(k==0) return result;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 1; j<=Math.abs(k); j++){
                if(k > 0){
                    sum = sum + nums[(i+j)%n];
                }
                else{
                    sum = sum + nums[(i-j+n)%n];
                }
            }
            result[i] = sum;
        }
        return result;
    }
    public static void main(String args[]){
        P1562 obj = new P1562();

        int[] code = {5, 7, 1, 4};
        int k = 3;
        int[] result = obj.decrypt(code, k);
        System.out.println(Arrays.toString(result));
    }
}