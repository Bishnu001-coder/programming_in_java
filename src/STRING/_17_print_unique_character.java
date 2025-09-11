package STRING;

public class _17_print_unique_character {
    public static void main(String[] args) {
        String s="javadev";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==ch[j]) {
                    count++;
                    ch[j]=' ';
                }
            }
            if(count==1) System.out.print(ch[i]);
        }
    }
}
