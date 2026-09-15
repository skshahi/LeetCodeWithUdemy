package integers;

public class ReverseSignedInteger {

    public static  int reverse(int x)
    {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        if(x==min || x==max) return 0;
        int reversed=0;
        while(x!=0)
        {
            int rem=x%10;
            if(reversed>max/10) return 0; //+ve value
            if(reversed<min/10) return 0; // -ve value
            reversed=reversed*10+rem;
            x=x/10;
        }
        return  reversed;

    }//TC: O(logn) ,SC: O(1)

    public static void main(String[] args) {

        System.out.println(reverse(-124));

    }
}
