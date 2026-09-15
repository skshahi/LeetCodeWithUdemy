package twopointer;

import java.util.Arrays;

public class TwoSumInSortedArray {
    public static  int[] twoSumPairIndex(int[]nums,int target)
    {
        int left=0,right=nums.length-1;
        while(left<right)
        {
            int sumPair=nums[left]+nums[right];
            if(sumPair==target)
            {
                break;
            } else if (sumPair>target) {
                right--;

            }else {
                left++;
            }
        }
        return  new int[]{left+1,right+1};


    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        System.out.println(Arrays.stream(twoSumPairIndex(nums,10)).boxed().toList());
    }
}
