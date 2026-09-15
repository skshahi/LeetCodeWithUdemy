package integers;

public class PowerOfNum {

    public static double powOfNum(int num,int pow)
    {
        long no=Math.abs(pow);
        double result=1.0;
        while (no!=0)
        {
            if(no%2==1)
            {
                result=result*num;
                no=no-1;

            }
            num=num*num;
            no=no/2;
        }
        return pow<0?1/result:result;
    }//TC:O(log n) ,SC: O(1)

    public static void main(String[] args) {
        System.out.println(powOfNum(2,-2));
    }
}
