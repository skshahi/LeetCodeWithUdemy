package stackqueue;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteriodCollision(int []asteriods)
    {
        Stack<Integer> stack=new Stack<>();
        for(int asteriod:asteriods)
        {
            if(asteriod>0)
            {
                stack.push(asteriod);
            }else {

                while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteriod)>stack.peek())
                {
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek()<0)
                {
                    stack.push(asteriod);
                }else if(stack.peek() +asteriod ==0)
                {
                    stack.pop();
                }

            }

        }

        int []result=new int[stack.size()];
        for(int i=result.length-1;i>=0;i--)
        {
            result[i]=stack.pop();
        }
        return  result;
    }

    public static void main(String[] args) {
        int []arr={4,5,-3,-6,3};
        System.out.println(Arrays.stream(asteriodCollision(arr)).boxed().toList());
    }
}
