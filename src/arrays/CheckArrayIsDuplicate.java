package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckArrayIsDuplicate {
    public static  boolean checkArrayIsDuplicateOrNot(int []arr)
    {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                return  true;
            }
            set.add(arr[i]);

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkArrayIsDuplicateOrNot(new int[]{1,2,4}));
    }
}
