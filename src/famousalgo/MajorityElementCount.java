package famousalgo;

public class MajorityElementCount {
    public static int countElement(int []nums)
    {
        int majorityElement=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
                majorityElement=nums[i];
            if(nums[i]==majorityElement)
                count++;
            else
                count--;

        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int []nums={2,5,3,1,2,3,5,1,2,1};
        System.out.println(countElement(nums));
    }
}
