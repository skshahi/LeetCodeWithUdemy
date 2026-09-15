package strings;

import java.util.*;

//DNA String means find repeative number of substring length 10
public class FindDNAString {

    public static List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set=new HashSet<>();
        HashSet<String> list=new HashSet<>();

        for(int i=0;i<=s.length()-10;i++)
        {
            String dna=s.substring(i,i+10);
            if(set.contains(dna))
            {
                list.add(dna);
            }else{
                set.add(dna);
            }

        }
        return new ArrayList<>(list);
    }

    public  static List<String> findDNAString(String str)
    {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<=str.length()-10;i++)
        {
            String dna=str.substring(i,i+10);
            map.put(dna,map.getOrDefault(dna,0)+1);

        }

        System.out.println(map);

        return map.entrySet().stream().filter(m->m.getValue()>1)
                 .map(Map.Entry::getKey).toList();
    }

    public static void main(String[] args) {
       // System.out.println(findDNAString("AAAAACCCCCCAAAAAAACCCCCCAGTX"));
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCCAAAAAAACCCCCCAGTX"));
    }
}
