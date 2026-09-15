package strings;

public class AnagramString {

    public static boolean checkAnagram(String s1,String s2)
    {

        if(s1.length()!=s2.length()) return  false;
        //way1 using arraylist
//        ArrayList<Character> al=new ArrayList<>();
//        for(int i=0;i<s1.length();i++)
//        {
//            al.add(s1.charAt(i));
//        }
//        for(int i=0;i<s1.length();i++)
//        {
//            Character ch=s2.charAt(i);
//            al.remove(ch);
//        }
//        return  al.isEmpty();

        //way2: hashmap by using the count of elements

        //way3 :
        int []counter=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            counter[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s1.length();i++)
        {
            counter[s2.charAt(i)-'a']--;
            if(counter[s2.charAt(i)-'a']<0)
            {
                return false;
            }
        }

        return  true;


    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("abc","cab"));
    }
}
