package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationKthLength {

    public static List<List<Integer>> combines(int nums, int k)
    {
        List<List<Integer>> list=new ArrayList<>();
        dfs(nums,list,k,new ArrayList<>(),1);
        return list;
    }

    private static void dfs(int nums, List<List<Integer>> list, int k, ArrayList<Integer> comb, int start) {
        if(comb.size()==k)
        {
            list.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=nums;i++)
        {
            comb.add(i);
            dfs(nums,list,k,comb,i+1);
            comb.remove(comb.size()-1);
        }


    }

    public static void main(String[] args) {
        System.out.println(combines(4,2));

    }

}//TC:O(k*nCk),SC: O(k)
