package STRING;

public class _1_reverse_a_string {
    public static void main(String[] args) {
        String s="BISHNU";
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);

    }
}
