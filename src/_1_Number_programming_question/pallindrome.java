package _1_Number_programming_question;

public class pallindrome {
    public static void main(String[] args) {
        int org_num = 141;
        int num = org_num;
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num/=10;
        }
        if(rev==org_num){
            System.out.println("it is a pallindrome");
        }else{
            System.out.println("it is not a pallindrome");
        }
    }
}
