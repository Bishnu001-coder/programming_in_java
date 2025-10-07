package _5_STRING;

public class _11_imp_reverse_word_in_string {
    public static void main(String[] args) {
        String s="bishnu prasad ma";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')count++;

        }
        System.out.println(count);
    }
}
