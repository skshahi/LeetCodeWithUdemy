package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindKthDiffPaiUnique {
    public static  int findKthDiffPair(int []nums,int k)
    {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(map.get(nums[i]),0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(k==0)
            {
                if(entry.getValue()>1)
                {
                    count++;
                }
            }else {
                if(map.containsKey(entry.getKey()+k))
                {
                    count++;
                }
            }
        }
        return  count;

    }

    public static void main(String[] args) {
        int []nums={1,2,3,1,5,4};
        System.out.println(findKthDiffPair(nums,2));
    }
}
