package _5_STRING;

public class _23_CONVERT_JAVADEV_J_V_D_IF_THE_VOWEL_graterhan_3 {
    public static void main(String[] args) {
        String s="javadev";
        int count=1;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
                ch[i]=' ';

            }

            }
        if(count>=3){
            System.out.println(ch);

        }

    }
}
