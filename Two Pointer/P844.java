import java.util.*;
class P844{
    public boolean backSpaceCompare(String s, String t){
        int i = s.length()-1;
        int j = t.length()-1;

        int skipS = 0, skipT = 0;
        while( i >= 0 || j >= 0){
            while(i>=0){
                if(s.charAt(i) == '#'){
                    skipS++;
                    i--;
                }
                else if(skipS > 0){
                    skipS--;
                    i--;
                }
                else{
                    break;
                }
            }

            while(j>=0){
                if(s.charAt(j) == '#'){
                    skipT++;
                    j--;
                }
                else if(skipT > 0){
                    skipT--;
                    j--;
                }
                else break;
            }

            if(i >= 0 && j>= 0 && (s.charAt(i) != s.charAt(j))){
                return false;
            }
            else if((i>=0) != (j>=0)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        P844 obj = new P844();
        System.out.println(obj.backSpaceCompare("ab#c","ad#c"));
    }
}