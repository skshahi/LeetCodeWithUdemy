package arrays;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static  int longestSubArrayZeroSum(int []arr)
    {
        int sum=0,len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                len=i+1;
            }else  if(map.containsKey(sum))
            {
                len=Math.max(len,i-map.get(sum));
            }else {
                map.put(sum,i);
            }
        }
        return  len;
    }

    public static void main(String[] args) {
        int []arr={7,2,-6,1,-3,6};
        System.out.println(longestSubArrayZeroSum(arr));
    }
}
