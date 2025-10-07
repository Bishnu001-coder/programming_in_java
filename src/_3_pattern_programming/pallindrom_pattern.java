package _3_pattern_programming;
import java.util.Scanner;
public class pallindrom_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number range");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp++);
            }
            temp-=2;
            for(int k=1;k<=i-1;k++){
                System.out.print(temp--);
            }

            System.out.println();
        }
    }
}
