package STRING;

public class __30__contains_method_question_remove_duplicate_char {
    public static void main(String[] args) {
        String s1="bishnu prasad maharana";
        String res="";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(!res.contains(ch+"")) res+=ch;
        }
        System.out.println(res);
    }


}
