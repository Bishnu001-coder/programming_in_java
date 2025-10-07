package _5_STRING;

public class _4_remove_all_spaces_string {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        String res="";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] !=' '){
                res+=ch[i];
            }
        }
        System.out.println(ch);


    }
}
