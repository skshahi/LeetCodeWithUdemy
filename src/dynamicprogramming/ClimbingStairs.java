package dynamicprogramming;

public class ClimbingStairs {
    public  static int climbStairs(int n)
    {
        if(n<=2)return n;
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int climbStairsWay2(int n)
    {
        if(n<=2)return n;
        int first=1,second=2;
        for(int i=1;i<=n-2;i++)
        {
            int temp=first+second;
            first=second;
            second=temp;

        }
        return second;

    }//TC O(n),SC:O(1)

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        //1,1,2,3,5,8
    }


}
