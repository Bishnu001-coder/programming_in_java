package _5_STRING;

public class _12_count_word_in_string {
    public static void main(String[] args) {
        String s="bi s sd sadsa sdad sad";
        int count=0;
        int j=0;
        while(j<s.length()){
            while(j<s.length() && s.charAt(j) != ' ') j++;
            count++;
            j++;

        }
        System.out.println(count);
    }
}
