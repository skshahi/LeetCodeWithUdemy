package twopointer;

public class MergeTwoSortedArray {

    public static void mergeTwoSortedArray(int []arr1,int m,int []arr2,int n )
    {
        int l1=arr1.length;
        int l2=arr2.length;
        int p1=m-1,p2=n-1;
        int []result=new int[l1+l2];

        for(int i=l1-1;i>=0;i--)
        {
            int valAtP1= p1>=0?arr1[p1]:Integer.MIN_VALUE;
            int valAtP2= p2>=0?arr2[p2]:Integer.MIN_VALUE;
            if(valAtP1>valAtP2)
            {
                arr1[i]=valAtP1;
                p1--;
            }else{
                arr1[i]=valAtP2;
                p2--;
            }
        }

        for(int i:arr1)
        {
            System.out.println(i);
        }


    }

    public static void mergeTwoArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int j = 0; // pointer for arr1
        int k = 0; // pointer for arr2
        int i = 0; // pointer for result

        // Compare elements from both arrays
        while (j < arr1.length && k < arr2.length) {
            if (arr1[j] <= arr2[k]) {
                result[i++] = arr1[j++];
            } else {
                result[i++] = arr2[k++];
            }
        }

        // Copy remaining elements from arr1
        while (j < arr1.length) {
            result[i++] = arr1[j++];
        }

        // Copy remaining elements from arr2
        while (k < arr2.length) {
            result[i++] = arr2[k++];
        }

        // Print result
        for (int num : result) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4, 5};

        mergeTwoArray(arr1, arr2);
    }

}
