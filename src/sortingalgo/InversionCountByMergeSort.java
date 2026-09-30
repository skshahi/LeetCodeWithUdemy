package sortingalgo;

public class InversionCountByMergeSort {

    public  static int inversionCount(int[]nums,int n)
    {
        int left=0,right=nums.length-1;
        return mergeSort(nums,left,right);

    }

    private static int mergeSort(int[] nums, int left, int right) {
        int count=0;
        if(left<right)
        {
            int mid=left+(right-left)/2;
          count+=  mergeSort(nums,left,mid);
            count+=mergeSort(nums,mid+1,right);
           count+= mergeSort(nums,left,mid,right);
        }
        return count;
    }

    private static int mergeSort(int[] nums, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;
        int []A=new int[n1];
        int []B=new int[n2];
        for(int i=0;i<n1;i++)
        {
            A[i]=nums[left+i];

        }
        for(int i=0;i<n2;i++)
        {
            B[i]=nums[mid+1+i];
        }

        //merge two sorted array
        int i=0,j=0,k=left,count=0;
        while (i<n1 && j<n2)
        {
            if(A[i]<B[j])
            {
                nums[k++]=A[i++];
            }else{
                count+=mid-(left+i)+1;//n1-i
                nums[k++]=B[j++];
            }
        }
        while (i<n1)nums[k++]=A[i++];
        while (j<n2)nums[k++]=B[j++];
        return count;

    }

    public static void main(String[] args) {
        int []nums={4,5,1,2,3,6,6,8};
        System.out.println(inversionCount(nums,0));
    }

}
