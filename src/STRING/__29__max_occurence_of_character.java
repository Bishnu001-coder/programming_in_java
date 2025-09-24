package STRING;

public class __29__max_occurence_of_character {
        public static void main(String[] args) {
            String s1 = "javadev";
            String s2 = "";
            char max_char = ' ';
            char min_char = ' ';
            int max_count = 0;
            int min_count = Integer.MAX_VALUE;
            int _2min_count=1;
            int _2max_count=1;
            while (s1.length() > 0) {
                char ch = s1.charAt(0);
                s2 = s1.replace(ch + "", "");
                int count = s1.length() - s2.length();

                if (count > max_count) {
                    max_count = count;
                    max_char = ch;
                }
                if (count < min_count) {
                    min_count = count;
                    min_char = ch;
                }

                System.out.println(ch + " -> " + count);
                s1 = s2;
            }

            System.out.println("Max: " + max_char + " -> " + max_count);
            System.out.println("Min: " + min_char + " -> " + min_count);
    }
}
