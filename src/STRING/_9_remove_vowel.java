package STRING;

public class _9_remove_vowel {
    public static void main(String[] args) {
        String s="bishnuprasadmaharana";
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e'&& ch!='i' && ch!='o'&& ch!='u' && ch!='A' && ch!='E'&& ch!='I' && ch!='O'&& ch!='U') {
                res+=ch;
            }
        }
        System.out.println(res);

            }
        }


