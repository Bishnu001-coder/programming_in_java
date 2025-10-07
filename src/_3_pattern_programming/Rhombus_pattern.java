package _3_pattern_programming;
import java.util.Scanner;
public class Rhombus_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of start want to print");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
