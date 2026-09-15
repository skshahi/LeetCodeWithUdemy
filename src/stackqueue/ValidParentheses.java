package stackqueue;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static  boolean validParentheses(String str)
    {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                char pop=stack.size()!=0?stack.pop():'#';
                if(pop!=map.get(ch))
                {
                    return  false;
                }
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(validParentheses("({[]})"));
    }
}
