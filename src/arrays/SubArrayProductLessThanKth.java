package arrays;

public class SubArrayProductLessThanKth {

    public static  int subArrayProductLessThanKth(int []nums,int k)
    {
        int product=1,left=0,count=0;
        for(int right=0;right<nums.length;right++)
        {
            product*=nums[right];
            while (left<=right && product>=k)
            {
                product/=nums[left];
                left++;
            }
            count=right-left+1;
        }
        return count;

    }

    public static void main(String[] args) {
        int []nums={10,2,5,6};
        System.out.println(subArrayProductLessThanKth(nums,100));
    }
}
