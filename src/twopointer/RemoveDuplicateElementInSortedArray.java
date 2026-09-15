package twopointer;

public class RemoveDuplicateElementInSortedArray {
    public static int  removeDuplicate(int []arr)
    {
        int left=0,right=0;
        while (right<arr.length)
        {
            if(arr[left]!=arr[right])
            {
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        for(int i=0;i<=left;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("============");
        return left+1;
    }

    public static void main(String[] args) {
        int []arr={1,1,2,3,3,4,5,6,6,7};

        System.out.println(removeDuplicate(arr));

    }
}
