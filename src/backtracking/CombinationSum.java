package backtracking;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static  List<List<Integer>> combinationSum(int [] nums, int target)
    {
        List<List<Integer>> list=new ArrayList<>();
        dfs(nums,list,new ArrayList<>(),target,0,0);
        return list;
    }

    private static void dfs(int[] nums, List<List<Integer>> list, ArrayList<Integer> comb, int target, int sum, int start) {
        if(sum==target)
        {
            list.add(new ArrayList<>(comb));
            return;
        }
        else if(sum>target)
        {
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            comb.add(nums[i]);
            dfs(nums,list,comb,target,sum+nums[i],i);
            comb.remove(comb.size()-1);
        }


    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,5},8));
    }

}
