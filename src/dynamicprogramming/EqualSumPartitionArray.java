package dynamicprogramming;

import java.util.Arrays;

public class EqualSumPartitionArray {
    public static int equalPartition(int N,int []arr)
    {
        int total= Arrays.stream(arr).sum();
        if(total%2==1) return 0;
        int target=total/2;
        boolean[]dp=new boolean[target+1];
        dp[0]=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int curr=dp.length-1;curr>=1;curr--)
            {
                if(curr>=arr[i])
                {
                    dp[curr]=dp[curr]||dp[curr-arr[i]];
                }

            }
        }
        return dp[target]==true?1:0;
    }

    public static void main(String[] args) {
        int []arr={1,5,11,5};
        System.out.println(equalPartition(4,arr));

    }
}
