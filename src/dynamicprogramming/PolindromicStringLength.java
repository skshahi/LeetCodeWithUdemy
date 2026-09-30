package dynamicprogramming;

public class PolindromicStringLength {
    public static int dfs(String s,int start,int end)
    {
        //base case
        if(start==end) return 1;
        if(start>end)return 0;
        //recursive case
        if(s.charAt(start)==s.charAt(end))
        {
            return 2+dfs(s,start+1,end-1);
        }
        int left=dfs(s,start+1,end);
        int right=dfs(s,start,end-1);
        return Math.max(left,right);
    }

    public static int longestPalindromicSubsequence(String s)
    {
        int n=s.length();
        return dfs(s,0,n-1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubsequence("fafddsdas"));
    }
}
