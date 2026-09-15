package integers;

public class SumOfKthPosition {

    public static int [] sumOfElement(int[] arr, int k)
    {
        int[] result=new int[arr.length];
        for(int  i=0;i<result.length;i++)
        {
            int res=0;
            if(i<k-1)
            {
                for(int j=0;j<=i;j++)
                {
                    res=res+arr[j];
                }
                result[i]=res;
            }else {
                for(int j=i+1-k;j<i;j++)
                {
                    res=res+arr[j];
                }
                result[i]=res;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
       int[] res = sumOfElement(new int[]{1,2,3,4,5,6},3);
       for(int r:res)
       {
           System.out.println(r);
       }

    }
}
