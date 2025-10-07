package _5_STRING;

public class __27__anagram_string {
    public static boolean anagram(String s1,String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0 && s2.length() == 0) return true;

            char ch = s1.charAt(0);
            s1 = s1.replace(ch + "", "");
            s2 = s2.replace(ch + "", "");
        return anagram(s1,s2);
    }


    public static void main(String[] args) {

        System.out.println(anagram("peek","keep"));
    }
}
