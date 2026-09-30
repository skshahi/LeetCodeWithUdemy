package backtracking;

import java.util.LinkedList;
import java.util.List;

public class LetterCombination {

    public static List<String> letterCombination(String digits)
    {
        LinkedList<String> list=new LinkedList<>();
        if(digits.length()==0)return list;
        list.add("");
        String []map={"","","abc","def","ghi","jkl","mno","pqr","stu","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            int index=Character.getNumericValue(digits.charAt(i));
            while(list.peek().length()==i)
            {
                String temp=list.remove();
                for(char ch:map[index].toCharArray())
                {
                    list.add(temp+ch);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(letterCombination("234"));
    }
}
