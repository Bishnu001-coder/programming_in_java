package Number_programming_question;
import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count =0;
        int temp=num;
        int sum=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp=num;

        while(temp>0){
            int last_digit=temp%10;
            sum+=Math.pow(last_digit,count);
            temp/=10;
        }
        if(sum==num){
            System.out.println(" it is amstrong");
        }else {
            System.out.println("it is not amstrong");
        }
    }
}
