package integers;

import java.util.HashSet;
import java.util.Set;

/**
 * Given non-empty integer array size n ,every element
 * appear twice except one find tha single element
 *
 * Note: TC:O(n), SC:O(1)
 */

//public class SingleNumber {
//    public static int singleElement(int []nums)
//    {
//        boolean flag =false;
//        for(int  i=0;i<nums.length;i++)
//        { flag=false;
//           for(int j=0;j<nums.length;j++)
//           {
//               if(nums[i]==nums[j] && i!=j)
//               {
//                   flag=true;
//                   break;
//               }
//           }
//           if(!flag)
//           {
//               System.out.println(nums[i]);
//               return nums[i];
//
//           }
//        }
//        return -1;
//    }//TC O(n2), SC:O(n)

//public class SingleNumber {
//    public static int singleElement(int []nums)
//    {
//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            if(set.isEmpty())
//            {
//                set.add(nums[i]);
//            }else {
//                if(set.contains(nums[i]))
//                {
//                    set.remove(nums[i]);
//                }else {
//                    set.add(nums[i]);
//                }
//            }
//        }
//        return set.stream().findFirst().orElse(-1);
//    }//TC O(n), SC:O(n)

public class SingleNumber {
    public static int singleElement(int []nums)
    {
        int num=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            num^=i;
//        }
        for (int n:nums)
        {
            num^=n;
        }
       return num;
    }//TC O(n), SC:O(1)

    public static void main(String[] args) {
        System.out.println(singleElement(new int[]{2,2,2}));
       // System.out.println(2^2^3);
    }
}
