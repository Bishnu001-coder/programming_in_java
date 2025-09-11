package STRING;

public class _16_REMOVE_DUPLICATE_LETTER {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==' ')continue;
                if(ch[i]==ch[j]){
                    ch[j]=' ';
                }

            }
        }
        System.out.println(ch);
    }
}
