import java.util.*;

public class P344{
    public void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;
        char temp;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        char[] s = {'H','a','n','n','a','h'};

        P344 obj = new P344();
        obj.reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}