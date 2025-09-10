package STRING;

public class _11_imp_reverse_word_in_string {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        int i=0,j=0,k=1;
        String res="";
        for( j=0;j<s.length();j++){
            while(j<s.length() && s.charAt(j)!=' ')j++;
            for(k=j-1;k>i;k--){
                res+=s.charAt(k);
            }
            if(j<s.length()) res+=" ";
            i=j;
        }
        System.out.println(res);
    }
}
