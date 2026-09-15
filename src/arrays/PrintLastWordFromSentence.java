package arrays;

public class PrintLastWordFromSentence {

    public static  int lastWord(String str)
    {
        int right=str.length()-1;
        while (right>=0 && str.charAt(right)==' ')
        {
            right--;
        }
        int left=right;
        while (left>=0 && str.charAt(left)!=' ')
        {
            left--;
        }
        System.out.println( left+" "+right);
        System.out.println(str.substring(left+1,right+1));
        return right-left;
    }

    public static void main(String[] args) {
        System.out.println(lastWord("The Sky is  blue"));
    }
}
