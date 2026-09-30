package sortingalgo;

import java.util.Arrays;

public class QuickSortAlgo {

    public static void quickSort(int []arr,int low ,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);// find sorted element index
            quickSort(arr,low,pi-1);//left part of arr
            quickSort(arr,pi+1,high);//right part of arr
        }

    }

    private static int partition(int[] arr, int low, int high) {
        int i=low-1;//0~i: always element less than pivot
        int pivot=arr[high];
        for(int j=low;j<high;j++)
        {
            if(pivot>arr[j])
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int []arr={8,44,66,54,64,98,4,435,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
