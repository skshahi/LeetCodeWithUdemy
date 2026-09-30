package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//list : [1,0,5,8,0,2,0,9]
//output: 1,5,8,2,9,0,0,0;
public class ArrangeZeroesAtEnd {

    public static List<Integer> zeroesEnd(List<Integer> list)
    {
        List<Integer> al=new ArrayList<>();
        for(int a:list)
        {
            if(a!=0)
            {
                al.add(a);
            }
        }
        System.out.println(list);
        System.out.println(al);
        int diff=(list.size()-al.size());
        for(int i=0;i<diff;i++)
        {
            al.add(0);
        }
        return al;
    }
    //[1,0,5,8,0,2,0,9]
    public static  List<Integer> zeroesAtEnd(List<Integer> list)
    {
        int p1 = 0;

        for (int p2 = 0; p2 < list.size(); p2++) {

            if (list.get(p2) != 0) {

                // Swap
                int temp = list.get(p1);
                list.set(p1, list.get(p2));
                list.set(p2, temp);

                p1++;
            }
        }

        System.out.println(list);
        return  list;
    }

    public static void main(String[] args) {
       // System.out.println(zeroesEnd(Stream.of(1,0,5,8,0,2,0,9).toList()));
        //zeroesAtEnd(Stream.of(1,0,5,8,0,2,0,9).toList());
       // System.out.println( zeroesAtEnd(Stream.of(1,0,5,8,0,2,0,9).toList()));
        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 0, 5, 8, 0, 2, 0, 9));

        System.out.println(zeroesAtEnd(list));
    }
}
///n+1;
