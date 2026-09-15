package strings;

import java.util.Arrays;

public class ReverseString {

    public static  String reverseWord(String str)
    {
        char[] charArray = str.toCharArray();
        int left=0,right=charArray.length-1;
        while(left<right)
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;

        }
        return Arrays.toString(charArray);
    }

    public static void main(String[] args) {

        System.out.println(reverseWord("sonu"));

    }
}
