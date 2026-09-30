package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthises {

    public static List<String> generateParenthises(int n)
    {
        List<String> list=new ArrayList<>();
        dfs(list,n,"",0,0);
        return list;
    }

    private static void dfs(List<String> list, int max, String str, int open, int close) {
   if(max*2==str.length())
   {
       list.add(str);
       return;
   }
   if(open<max)
   {
       dfs(list,max,str+"(",open+1,close);
   }
   if(close<open)
   {
       dfs(list,max,str+")",open,close+1);
   }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthises(3));
    }
}
