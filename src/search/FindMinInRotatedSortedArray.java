package search;

public class FindMinInRotatedSortedArray {

    public static int findMinvalue(int []arr)
    {
        //arr have one element
        if(arr.length==1) return arr[0];
        //arr have two element
        if(arr.length==2) return Math.min(arr[0],arr[1]);
        //if arr is sorted ...
        if (arr[0]<arr[1])return arr[0];

        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            //The array is decreasing at mid +1
            if(arr[mid]>arr[mid+1]) return  mid+1;
            //the array is decreasing at mid
            if(arr[mid-1]>arr[mid]) return  mid;
            //discard the sorted part >> increasing part
            if(arr[left]<arr[mid])
                left=mid+1;
            else
                right=mid-1;


        }
        return -1;

    }

    public static void main(String[] args) {
        int []arr={3,4,5,1,2};

        System.out.println(findMinvalue(arr));
    }
}
