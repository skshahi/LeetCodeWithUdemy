package sortingalgo;

public class MergeSort {

    public static int [] mergeSort(int []nums,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            mergeSort(nums,left,mid,right);
        }
        return nums;
    }

    private static void mergeSort(int[] nums, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;
        int []A=new int[n1];
        int []B=new int[n2];
        //insert value to A
        for(int i=0;i<n1;i++)
        {
            A[i]=nums[left+i];
        }
        for(int i=0;i<n2;i++)
        {
            B[i]=nums[mid+1+i];
        }
        //merge to array A and B in sorted manner
        //left->mid=A,mid+1->right=B,left->right=nums
        int i=0,j=0,k=left;
        while (i<n1 && j<n2)
        {
            if(A[i]<B[j])
            {
                nums[k++]=A[i++];
            }else {
                nums[k++]=B[j++];
            }
        }
        while (i<n1)
            nums[k++]=A[i++];
        while (j<n2)
            nums[k++]=B[j++];

    }

    public static void main(String[] args) {
        int []nums={4,5,7,6,3,4,6,2,9,1};
        mergeSort(nums,0,nums.length-1);
    }
}
