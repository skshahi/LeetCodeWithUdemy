package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class RansomNote {

    public static  boolean checkRansomNote(String magzine,String ransom)
    {
        int []frequency=new int[26];
        for(int i=0;i<magzine.length();i++)
        {
            char c=magzine.charAt(i);
            frequency[c-'a']++;
        }
        for(int i=0;i<ransom.length();i++)
        {
            char c=ransom.charAt(i);
            if(frequency[c-'a']==0) return false;
            frequency[c-'a']--;
        }

        return  true;
    }

    public static void main(String[] args) {
        System.out.println(checkRansomNote("hellojavadeveloper","java"));;
        System.out.println(checkRansomNote("welcome","mole"));
        System.out.println(checkRansomNote("helo","java"));
    }
}
