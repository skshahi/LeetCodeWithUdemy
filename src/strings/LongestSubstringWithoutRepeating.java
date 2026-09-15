package strings;

public class LongestSubstringWithoutRepeating {
    public static  String longestSubStringWithoutRepeatingChar(String s)
    {
        StringBuilder result= new StringBuilder();

        //way1
//        for(int i=0;i<s.length();i++)
//        {
//            if(!result.toString().contains(s.charAt(i)+""))
//            {
//                result.append(s.charAt(i));
//            }
//        }
        //way2:
        for(int i=0;i<s.length();i++)
        {
           if(result.isEmpty())
           {
               result.append(s.charAt(i));

           }else{
               boolean flag=false;
               for( int j=0;j<result.length();j++)
               {
                   if(s.charAt(i)==result.charAt(j))
                   {
                    flag=true;
                    break;
                   }else {
                       flag=false;
                   }

               }
               if(!flag)
               {
                   result.append(s.charAt(i));
               }
           }
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestSubStringWithoutRepeatingChar("shgs"));
    }
}
