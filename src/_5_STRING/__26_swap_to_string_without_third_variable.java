package _5_STRING;

public class __26_swap_to_string_without_third_variable {
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+"\n"+b);
    }
}
