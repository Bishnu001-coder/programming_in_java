package STRING;

public class _21_print_sub_string_pallindrome_given_string {
    public static boolean pallindrome(String s) {
    int i=0,j=s.length()-1;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
    }
    return true;
       }

    public static void main(String[] args) {
    String s="level";
    int n=s.length();
for(int i=0;i<n;i++){
    for(int j=i+1;j<=n;j++){
        String sub=s.substring(i,j);
        if(pallindrome(sub)){
            System.out.println(sub);
        }
    }
}
    }
}
