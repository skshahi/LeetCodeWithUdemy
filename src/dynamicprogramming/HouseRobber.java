package dynamicprogramming;

public class HouseRobber {
    public static int rob(int []nums)
    {
        if(nums.length==1) return nums[0];
        int []dp=new int[nums.length+1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int rob=nums[i]+dp[i-2];
            int notRob=dp[i-1];
            dp[i]=Math.max(rob,notRob);
        }
        return dp[nums.length-1];

    }//TC:O(n),SC:O(n)
    public static int robWay2(int []nums)
    {
        if(nums.length==1)return nums[0];
        int prev1=nums[0];
        int prev2=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int curr=Math.max(nums[i]+prev1,prev2);
            prev1=prev2;
            prev2=curr;
        }

return prev2;
    }//TC:O(n),SC:O(1)

    public static void main(String[] args) {
        int []nums={1,2,3,1};
        System.out.println(robWay2(nums));
    }
}
