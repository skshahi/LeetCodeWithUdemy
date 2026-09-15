package arrays;

public class RotateArrayKthFromRight {

    public static void rotateKthTimeFromRight(int []arr,int k)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        k=k% arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");

    }

    private static void reverse(int[] arr, int start, int end) {

        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        rotateKthTimeFromRight(arr,2);
    }
}
