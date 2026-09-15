package integers;

/**
 * if number divisible by 3 & 5 : FizzBuzz
 * if number divisible by 3 : Fizz
 * if number divisible by 5 : Buzz
 */
public class FizzBuzz {
    public static void fizzBuzzSolution(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }else if(i%3==0)
            {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(""+i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzzSolution(15);
    }
}
