package Number_programming_question;
import java.util.Scanner;
public class strong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(temp>0){
        int digit = temp%10;
        int fact=1;

        for(int i=1;i<=digit;i++){
            fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num){
            System.out.println("it is strong number");
        }else {
            System.out.println("it is not a strong number");
        }
    }

}
