package _5_STRING;

public class _17_print_unique_character {
    public static void main(String[] args) {
        String s="java is easy";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int count=1;
            if(ch[i]==' ')continue;
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==ch[j]) {
                    count++;
                    ch[j]=' ';
                }

            }
            System.out.println(ch[i]+"->"+count);
        }

    }
}
