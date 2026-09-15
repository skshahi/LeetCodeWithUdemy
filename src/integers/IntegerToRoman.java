package integers;

public class IntegerToRoman {

    public static  String convertIntegerToRoman(int num)
    {
        int []romanInt={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []romanValue={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman= new StringBuilder();
        for(int i=0;i<romanInt.length;i++)
        {
            while(num>=romanInt[i])
            {
                String symbol=romanValue[i];
                roman.append(symbol);
                num=num-romanInt[i];
            }
        }
        return  roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertIntegerToRoman(150));
    }
}
