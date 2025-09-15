package STRING;

public class __28__occuraence__of_character_in_a_String {
    public static void main(String[] args) {
        String s="javadev";
        int orglen=s.length();
        while(s.length()>0){
            char ch=s.charAt(0);
            s=s.replace(ch+"","");
            int count=orglen-s.length();
            System.out.println(ch+"->"+count);
        }

    }
}
