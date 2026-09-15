package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNum {

    public  static List<Integer> findAllDuplicate(int []nums)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i]) - 1;
            if(nums[index]<0)
            {
                list.add(Math.abs(nums[i]));
            }else {
                nums[index]=-1*nums[index];
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int []nums={1,4,1,3,4};
        System.out.println(findAllDuplicate(nums));
    }
}
