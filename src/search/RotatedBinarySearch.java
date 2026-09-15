package search;

public class RotatedBinarySearch {
    public static int binarySearchAlgo(int []arr,int value)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==value)
            {
                return mid;
            } else if (arr[left]<=arr[mid]) { //left right sorted..
                if(arr[left]<=value && value<arr[mid])
                right=mid-1;
                else
                    left=mid+1;

            }else {//mid to right sorted
                if(arr[mid]<value && value<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int []arr={5,6,7,1,2,3};
        System.out.println(binarySearchAlgo(arr,2));
    }
}
