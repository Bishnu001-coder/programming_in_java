package STRING;

public class _13_longest_word_in_string {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        int i=0,j=0;
        String longest="";
        while(j<s.length()){
            while(j<s.length() && s.charAt(j)!= ' ')j++;
            String word=s.substring(i,j);
            if(word.length()>longest.length()) longest=word;
            j++;
            i=j;
        }
        System.out.println(longest);
    }
}
