package _5_STRING;

public class _14_check_pallindrom_string {
    public static void main(String[] args) {
        String s="madam level bishnu";
        int i=0,j=0,k=0;
        String rev="";
        String str="";
        while(j<s.length()){
            while(j<s.length() && s.charAt(j)!=' ') {
             str+=s.charAt(j);
                j++;
            }
            k=j-1;
            while(k>=i) {rev+=s.charAt(k);
                k--;
            }
            if(rev.equals(str)){
                System.out.println(str+"->it is a pallindrome");
            }else{
                System.out.println(str+"it is not a pallindrom");
            }
            j++;
            i=j;
            str="";
            rev="";

        }
    }
}
