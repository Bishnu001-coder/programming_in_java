package _3_pattern_programming;
import java.util.Scanner;
public class number_increasing_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number range");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            //this for spaces//
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }
            //this for number
            for(int j=1;j<= 2*i-1;j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
           //this for spaces//
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }
            //this for number
            for(int j=1;j<= 2*i-1;j++) {
                System.out.print(j);

                }
            System.out.println();
            }
    }
}
