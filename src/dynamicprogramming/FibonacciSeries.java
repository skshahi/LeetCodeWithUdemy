package dynamicprogramming;

public class FibonacciSeries {
    public static int fib(int n)
    {
        if(n<=1)return n;
        int first=0,second=1;
        for(int i=2;i<=n;i++)
        {
            int temp=first+second;
            first=second;
            second=temp;
        }
        return second;

    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}//TC:O(n),SC:O(1)
