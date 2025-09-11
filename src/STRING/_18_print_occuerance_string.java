package STRING;

public class _18_print_occuerance_string {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        char[] ch=s.toCharArray();
        for(int j=0;j<s.length();j++){
            int count=1;
            if (ch[j]==' ')continue;
            for(int i=j+1;i<s.length();i++){
                if(ch[j]==ch[i]) {
                    count++;
                    ch[i]=' ';
                }

            }
            System.out.println(ch[j]+"->"+count);
        }
    }
}
