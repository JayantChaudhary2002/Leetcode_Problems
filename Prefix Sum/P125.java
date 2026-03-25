import java.io.*;
import java.util.*;

public class P125{
    public boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = s.length() - 1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        P125 obj = new P125();
        System.out.println(obj.isPalindrome(s));
    }
}