package STRING;

public class _24_BADABABBA_THE_NUMBER_OF_ABA_SUBSTRING_ARE_THERE {
    public static void main(String[] args) {
        String s = "ABADABABBA";
        int count = 0;
        for (int i = 0; i < s.length()-3; i++) {
            String sub=s.substring(i,i+3);
            if(sub.equals("ABA")){
                count++;
            }
        }
        System.out.println(count);
    }
}
