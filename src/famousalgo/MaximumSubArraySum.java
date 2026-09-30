package famousalgo;

public class MaximumSubArraySum {
    public static void maximumSubarraySum(int []nums)
    {
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int []num={-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarraySum(num);
    }
}
