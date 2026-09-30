package backtracking;

import java.util.*;

public class PermutaionInDuplicateString {
    public static List<String> findPermutaion(String str)
    {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String str1=new String(charArray);
        List<String> list=new ArrayList<>();
        dfs(str1,"",list);
        return list;
    }

    public static void dfs(String str,String perm,List<String> list)
    {
        if(str.length()==0)
        {
            list.add(perm);
        }
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!set.contains(ch)) {
                String temp = str.substring(0, i) + str.substring(i + 1);
                dfs(temp,perm+ch,list);
            }
            set.add(ch);

        }


    }

    public static void main(String[] args) {
        List<String> list = findPermutaion("aba");
        System.out.println(list);
    }
}
