package _5_STRING;

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
    String s="level madam bob";
        String minipal=null;
        String maxpal="";
    int n=s.length();
for(int i=0;i<n;i++){

    for(int j=i+1;j<=n;j++){
        String sub=s.substring(i,j);
        if( sub.length()>1 && pallindrome(sub)){
            if(minipal==null||sub.length()<minipal.length()){
                minipal=sub;
            }
            if(sub.length()>maxpal.length()){
                maxpal=sub;
            }
        }

    }
}
        System.out.println(minipal+"\n"+maxpal);
    }
}
