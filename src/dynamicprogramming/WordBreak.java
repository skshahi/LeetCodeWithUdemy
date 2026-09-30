package dynamicprogramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//construct a string in array of string
public class WordBreak {

public static boolean wordBreak(String s, List<String> wordDict)
{
    boolean []dp=new boolean[s.length()+1];
    dp[0]=true;
    Set<String> set=new HashSet<>(wordDict);
    for(int i=1;i<=s.length();i++)
    {
        for(int j=0;j<i;j++)
        {
            String suffix=s.substring(j,i);
            if(set.contains(suffix) && dp[j]==true)
            {
                dp[i]=true;
                break;
            }
        }
    }
    return dp[s.length()];
}//TC:O(n^3+m),SC:O(n+m)

    public static void main(String[] args) {
        String []word={"sonu","kumar","anshika"};
        System.out.println(wordBreak("sonuanshika", Arrays.stream(word).toList()));
    }

}
