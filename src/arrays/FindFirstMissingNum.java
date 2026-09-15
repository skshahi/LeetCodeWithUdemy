package arrays;

public class FindFirstMissingNum {

    public static  int  findFirstMissingNum(int []arr)
    {
        //preprocessing  the array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr[i]=arr.length+1;
            }
        }

        //marking indices

        for(int i=0;i<arr.length;i++)
        {
            int index=Math.abs(arr[i])-1;
            if(index<arr.length && arr[index]>0)
            {
                arr[index]=-1*arr[index];
            }
        }
        //scan the array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                return i+1;
            }
        }
        return  arr.length+1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,5};
        System.out.println(findFirstMissingNum(arr));

    }
}
