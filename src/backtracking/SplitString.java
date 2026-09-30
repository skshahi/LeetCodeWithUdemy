package backtracking;

import java.util.ArrayList;

public class SplitString {

    public static boolean splitString(String s) {
        return dfs(new ArrayList<>(), s, 0);
    }

    private static boolean dfs(ArrayList<Long> list, String str, int start) {

        if (start == str.length()) {
            return list.size() >= 2;
        }
        long num = 0;
        for (int i = start; i < str.length(); i++) {
            num = num * 10 + str.charAt(i) - '0';
            if (list.size() == 0 || list.get(list.size() - 1) - num == 1) {
                list.add(num);
                if (dfs(list, str, i + 1)) return true;
                list.remove(list.size() - 1);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(splitString("321"));
        ;
        System.out.println(splitString("123"));

        String str="sonu";
        System.out.println(str.contains("p"));
    }
}