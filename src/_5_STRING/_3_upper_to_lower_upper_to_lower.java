package _5_STRING;

public class _3_upper_to_lower_upper_to_lower {
    public static void main(String[] args) {
        String s="BiShnUPrasDMahArANa";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' &&ch[i]<='z') ch[i]-=32;
                else if(ch[i]>='A'&& ch[i]<='Z') ch[i]+=32;
        }
        System.out.println(ch);
    }
}
