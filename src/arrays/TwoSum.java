package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSum(int []arr,int target)
    {
        int []result=new int[2];
        boolean flag=false;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=target-arr[i];
            if(map.containsKey(num))
            {
                result[0]=i;
                result[1]=map.get(num);
                flag=true;
                break;
            }else {
                map.put(arr[i],i);
            }
        }

        return flag ? result:null;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,5,6};
        System.out.println(Arrays.toString(findTwoSum(arr,16)));
    }
}
