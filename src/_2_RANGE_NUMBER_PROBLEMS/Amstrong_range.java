package _2_RANGE_NUMBER_PROBLEMS;
import java.util.Scanner;
public class Amstrong_range {
    static boolean amstrong(int num){
        int original=num;
        int count=0;
        while(original>0){
            count++;
            original/=10;
        }
        original=num;
        int sum=0;
        int last_digit;
        while(original>0){
            last_digit=original%10;
            int pow=1;
            for(int i=1;i<=count;i++){
                pow*=last_digit;
            }
            sum+=pow;
            original/=10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a start and end");
    int st=sc.nextInt();
    int end=sc.nextInt();
        System.out.println("amstrong number is range");
    for(int i=st;i<=end;i++){
        if(amstrong(i)){
            System.out.println(i);
        }
    }
    }
}
