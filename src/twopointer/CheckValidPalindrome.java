package twopointer;

import java.util.HashMap;

public class CheckValidPalindrome {
    
    public static boolean checkValidPalindrome(String str)
    {
        int p1=0,p2=str.length()-1;
        
        while(p1<=p2)
        {
            HashMap map=new HashMap();

            char c1=str.charAt(p1);
            char c2=str.charAt(p2);
            if(!Character.isLetter(c1)) {
                p1++;
            }else if (!Character.isLetter(c2)) {
                p2--;
            }else {
                if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)) {
                    return false;
                }
                p1++;
                p2--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValidPalindrome("a1bc25ba"));
    }
}
