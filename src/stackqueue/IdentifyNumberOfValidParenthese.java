package stackqueue;

import java.util.Stack;

public class IdentifyNumberOfValidParenthese {
    public static  int validParenthese(String str)
    {
        int ans=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                stack.push(i);
            }else {
                stack.pop();
                if(stack.size()==0)
                {
                    stack.push(i);
                }else {
                    ans=Math.max(ans,i-stack.peek());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(validParenthese("(()"));
    }
}
