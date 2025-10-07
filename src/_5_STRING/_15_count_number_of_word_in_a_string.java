package _5_STRING;

public class _15_count_number_of_word_in_a_string {
    public static void main(String[] args){
    String s="bishnu prasad maharana";
    String str="";
    int i=0,j=0, word=0;
    while(j<s.length()){
        while(j<s.length() && s.charAt(j) != ' ') {
            str+=s.charAt(j);
            j++;
        }
        word=j-i;
        System.out.println(str+"->"+word);
        str="";
       j++;
       i=j;

    }
    }

}
