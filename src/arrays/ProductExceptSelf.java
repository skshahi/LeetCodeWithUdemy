package arrays;

public class ProductExceptSelf {
    public static void productExceptSelf(int []arr)
    {
        int prefix=1,suffix=1;
        int []parr=new int[arr.length];
        parr[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            prefix=prefix*arr[i-1];
            parr[i]=prefix;
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            parr[i]=parr[i]*suffix;
            suffix=suffix*arr[i];
        }

        for(int i:parr)
        {
            System.out.println(i);
        }



    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};

        //prefix: 1, 1, 2,6
        //suffix: 24,12,4.1
        productExceptSelf(arr);
    }
}
