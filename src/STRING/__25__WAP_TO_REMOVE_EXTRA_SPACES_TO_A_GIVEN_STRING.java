package STRING;

public class __25__WAP_TO_REMOVE_EXTRA_SPACES_TO_A_GIVEN_STRING {
    public static void main(String[] args) {
        String s1="java  is   easy";
        String s2="";

        for(int i=0;i<s1.length();i++){
           char ch=s1.charAt(i);
                if (ch!=' '){
                    s2+=ch;
                    }
                else if (s2.length() > 0 && s2.charAt(s2.length() - 1) != ' ') {
                    s2+=ch;
                             }
                        }
        System.out.println(s2);
                }


            }

