package integers;

import java.util.HashMap;

public class RomanToInteger {

    public static  int romanToInteger(String roman)
    {
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result=0;
        for(int i=0;i<roman.length();i++)
        {
            if(i<roman.length()-1 && (romanMap.get(roman.charAt(i))< romanMap.get(roman.charAt(i+1))))
            {
             result=result-romanMap.get(roman.charAt(i));
            }else {
                result=result+romanMap.get(roman.charAt(i));

            }
        }
        return  result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("LVIII"));
        System.out.println(romanToInteger("MCMXCIV"));
    }
}
