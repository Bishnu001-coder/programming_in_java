package _1_Number_programming_question;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        System.out.println("all the even number");
        for(int i=2;i<num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("all the odd number");
        for(int i=2;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }



}
