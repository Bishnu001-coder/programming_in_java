package _5_STRING;

public class _001_practise {
    public static void main(String[] args) {
        String s="java   is    easy";
        String s2="";

        for(int i=0;i<s.length();i++){

           char c=s.charAt(i);
           if(c!=' '){s2+=c;}

        else if(s2.length()>0 && s2.charAt(s2.length()-1)!=' ')s2+=' ';
        }

        System.out.println(s2);
    }
}

