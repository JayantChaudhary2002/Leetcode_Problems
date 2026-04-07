import java.util.*;
class P746{
    public int minCostClimbingStairs(int[] cost){
        int a = cost[0];
        int b = cost[1];

        for(int i =2; i < cost.length; i++){
            int c = cost[i] + Math.min(a,b);
            a=b;
            b=c;
        }
        return Math.min(a,b);
    }
    public static void main(String args[]){
        P746 obj = new P746();
        int[] cost = {10,15,20};
        System.out.println(obj.minCostClimbingStairs(cost));
    }
}