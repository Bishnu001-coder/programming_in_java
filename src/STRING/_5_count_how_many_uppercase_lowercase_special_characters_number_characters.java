package STRING;

public class _5_count_how_many_uppercase_lowercase_special_characters_number_characters{
    public static void main(String[] args) {
        String s="BiShnu@123";
        int uc=0,lc=0,sp=0,nc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z') uc++;
            else if(ch>='a' && ch<='z') lc++;
            else if(ch>='0' && ch<='9') nc++;
            else {
                sp++;
            }
        }
        System.out.println("uppercase:"+uc+"\n"+"lowercase:"+lc+"\n"+"specialcase:"+sp+"\n"+"numbercharacter:"+nc);
    }
}
