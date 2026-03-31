import java.util.*;
class P217{
    public boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        P217 obj = new P217();
        System.out.println(obj.containsDuplicate(nums));
    }
}