package search;

public class BinarySearch {
    public static int binarySearchAlgo(int []arr,int value)
    {
        int left=0;
        int right=arr.length;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==value)
            {
                return mid;
            } else if (arr[mid]<value) {
                left=mid+1;

            }else {
                right=mid-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,5,7,9};

        System.out.println(binarySearchAlgo(arr,9));
    }
}