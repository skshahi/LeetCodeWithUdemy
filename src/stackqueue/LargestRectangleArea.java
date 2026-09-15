package stackqueue;

import java.util.Stack;

public class LargestRectangleArea {
    public static int largestRectangleArea(int []heights)
    {
        int maxArea=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<=heights.length;i++)
        {
            int curr=(i==heights.length)?-1:heights[i];
            while (!stack.isEmpty()&& curr<=heights[stack.peek()])
            {
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                int currArea=height*width;
                maxArea=Math.max(maxArea,currArea);

            }
            stack.push(i);

        }
        return maxArea;
    }

    public static void main(String[] args) {
        int []heights={1,2,5,6,1,3};
        System.out.println(largestRectangleArea(heights));
    }
}
