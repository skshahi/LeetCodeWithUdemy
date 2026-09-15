package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class MoveAllZeroesToLast {

    public static  void moveAllZeroes(int []arr)
    {
        if(arr.length==1) return;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                queue.add(arr[i]);
            }
        }

        int index=0;
        while (!queue.isEmpty())
        {
            arr[index]=queue.poll();
            index++;
        }

        for(int i=index;i<arr.length;i++)
        {
            arr[i]=0;
        }

        for(int i:arr)
        {
            System.out.println(i);
        }
    }

    public static  void moveAllZeroesAtEnd(int []arr)
    {
        if(arr.length==1)return;
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[left]=arr[i];
                left++;
            }
        }
        for(int i=left;i<arr.length;i++)
        {
            arr[i]=0;
        }

        for(int i:arr)
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int []arr={1,2,0,8,0,6,4,0,6,9};
        moveAllZeroesAtEnd(arr);
    }
}
