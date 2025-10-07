package _5_STRING;

public class _7_sum_alphanumeric_charcter_in_string {
    public static void main(String[] args) {
        String s="bishnu@123";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                    if(ch>='0' && ch<='9'){
                        sum+=ch-'0';

                    }
        }
        System.out.println(sum);
    }
}
