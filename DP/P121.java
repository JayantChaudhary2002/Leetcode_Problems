import java.util.*;
class P121{
    public int stockProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int price:prices){
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
    }
    public static void main(String args[]){
        P121 obj = new P121();
        int prices[] = {7,1,5,3,6,4};
        System.out.println(obj.stockProfit(prices));
    }
}