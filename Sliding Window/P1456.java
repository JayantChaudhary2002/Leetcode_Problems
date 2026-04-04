import java.util.*;
class P1456{
    public int maxVowels(String s, int k){
        int count = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int max = count;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                count++;
            }

            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c){
            return "aeiou".indexOf(c) != -1;
    }

    public static void main(String args[]){
        P1456 obj = new P1456();
        String s = "abciiidef";
        int k = 3;
        System.out.println(obj.maxVowels(s,k));
    }
}