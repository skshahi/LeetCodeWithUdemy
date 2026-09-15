package arrays;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigit {
    public  static List<Integer> sequentialDigitBetweenRange(int low, int high)
    {

        List<Integer> sequentialDigit=new ArrayList<>();
        String range="123456789";
        for(int i=1;i<=9;i++)
        {
            for(int j=0;i+j<=9;j++)
            {
                String temp=range.substring(j,i+j);

                int val = Integer.parseInt(temp);
                if(val>=low && val<=high)
                {
                    sequentialDigit.add(val);
                }


            }
        }
        return sequentialDigit;

    }

    public static void main(String[] args) {
        System.out.println(sequentialDigitBetweenRange(100,500));
    }
}
