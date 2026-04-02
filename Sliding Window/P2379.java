import java.util.*;
class P2379{
    public int minReColors(String blocks, int k){
        int white = 0;
        for(int i = 0; i< k; i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }

        int min = white;
        for(int i = k; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }

            if(blocks.charAt(i-k) == 'W'){
                white--;
            }
            min = Math.min(min,white);
        }
        return min;
    }
    public static void main(String args[]){
        P2379 obj = new P2379();
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(obj.minReColors(blocks, k));
    }
}