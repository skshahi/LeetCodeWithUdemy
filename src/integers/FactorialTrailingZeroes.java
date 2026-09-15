package integers;

/**
 * 4!= 0 zeroes at end
 * 5!= 1 zeroes at end
 * 10!= 2 zeroes at end
 * 15!= 3 zeroes at end
 * 20!= 4 zeroes at end
 * 25!=6 zeroes at end
 *
 * calculate : (n/5 + n/25+ n/125 + n/625+ ....n/5^x)
 */
public class FactorialTrailingZeroes {

    public static  int findTrailingZeroes(int n)
    {
        int count=0;
        int currentPower=5;
        while(n>=currentPower)
        {
            count+=(n/currentPower);
            currentPower*=5;
        }
        return  count;
    }

    public static void main(String[] args) {
        System.out.println(findTrailingZeroes(25));
    }

}
