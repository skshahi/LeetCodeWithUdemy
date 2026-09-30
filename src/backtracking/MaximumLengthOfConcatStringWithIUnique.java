package backtracking;

import java.util.Arrays;
import java.util.List;

//you are given an array of string arr,.Astring s is formed by the  concatenation
//of subsequence of arr that has unique characters.
//return the maximum possible length of s.
//A subsequence is an array that can be derived from another array by deleting some or no element without changing the order of the remaining elements.
//EX.: arr=["un","iq","ue"]
//output: 4
//explanation:
// "un"
// "iq"
// "ue"
//"uniq"
//"ique"
//max length=4
public class MaximumLengthOfConcatStringWithIUnique {
public static  int maxLength(List<String> list)
{
    return dfs(list,"",0);
}

    private static int dfs(List<String> list, String str, int curr) {
    if(curr==list.size())
    {
        System.out.println(str);
        return str.length();
    }
    int left=0,right=0;
    String temp=str+list.get(curr);
    if(isUnique(temp))
    {
        left=dfs(list,temp,curr+1);
    }
    right=dfs(list,str,curr+1);
    return Math.max(left,right);
    }

    private static boolean isUnique(String temp) {
    int []arr=new int[26];
    for(int i=0;i<temp.length();i++)
    {
        arr[temp.charAt(i)-'a']++;
    }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>1)
            return  false;
    }
    return true;

    }

    public static void main(String[] args) {
        System.out.println(maxLength(Arrays.asList("un","iq","ue")));
    }

}
