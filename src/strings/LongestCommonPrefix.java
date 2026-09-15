package strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String []str)
    {
        String prefix=str[0];

        System.out.println("sonu".indexOf("on"));

        for(int i=1;i<str.length;i++)
        {
            while(str[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }
}
