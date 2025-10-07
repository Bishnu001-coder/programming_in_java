package _1_Number_programming_question;
import java.util.Scanner;
public class neon_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sqrt=num*num;
        int temp=sqrt;
        int sum=0;
        while(temp>0){
            int last_digit=temp%10;
            sum+=last_digit;
            temp/=10;
        }
        if(num==sum){
            System.out.println("it is a Neon number");
        }else{
            System.out.println("it is a not Neon number");
        }
    }
}
