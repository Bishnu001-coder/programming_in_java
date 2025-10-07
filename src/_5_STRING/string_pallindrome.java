package _5_STRING;

public class string_pallindrome {
    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
               rev+=ch;
        }

        if(rev.equals(s)){
            System.out.println("it is a pllaindrome");

        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
