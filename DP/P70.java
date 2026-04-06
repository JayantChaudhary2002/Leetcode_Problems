import java.util.*;
class P70{
    public int climbStairs(int n){
        if(n<=2) return n;
        int a = 1, b=2;
        for(int i = 3; i <= n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String args[]){
        P70 obj = new P70();
        int n = 5;
        System.out.println(obj.climbStairs(n));
    }
}