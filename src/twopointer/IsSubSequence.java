package twopointer;

public class IsSubSequence {
    public static  boolean isSubsequence(String str1,String str2)
    {
        int p1=0,p2=0;
        while(p1<str1.length() && p2<str2.length())
        {
            if(str1.charAt(p1)==str2.charAt(p2))
            {
                p1++;
                p2++;
            }else {
                p2++;
            }

        }
        return p1==str1.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","adbb"));
    }
}
