package integers;

public class PalindromeNumber {
    public static boolean checkPalindrome(int num)
    {
        if(num<0)
        {
            return  false;
        }
        if(num!=0 && num%10==0) return  false;
        int n=num;
        int reverseNum=0;
        int rem=0;
        while(n>reverseNum)
        {
            rem=n%10;
            reverseNum=reverseNum*10+rem;
            n=n/10;

        }
        System.out.println(reverseNum);
        System.out.println(num);
        return  n==reverseNum || n==reverseNum/10;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(15251));
    }
}
