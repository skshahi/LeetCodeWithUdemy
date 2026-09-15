package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearNum {

    public static List<Integer> findAllDisappearNumber(int []nums)
    {
        List<Integer> disappearNum=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i]) - 1;
            if(nums[index]>0)
            {
                nums[index]= -1 * nums[index];

            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                disappearNum.add(i+1);
            }
        }

        return disappearNum;

    }

    public static void main(String[] args) {
        int []nums={1,4,5,3,2};
        System.out.println(findAllDisappearNumber(nums));
    }
}
