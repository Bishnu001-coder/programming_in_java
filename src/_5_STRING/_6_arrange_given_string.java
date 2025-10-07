package _5_STRING;

public class _6_arrange_given_string {
    public static void main(String[] args) {
        String s="bishnuPRASAD@123";
        String uc="",lc="",sp="",nc="";
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' &&ch<='Z') uc+=ch;
            else if(ch>='a' && ch<='z') lc+=ch;
            else if(ch>='0' && ch<='9') nc+=ch;
            else{sp+=ch ;}
        }
        res=nc+lc+sp+uc;
        System.out.println(res);
    }
}
