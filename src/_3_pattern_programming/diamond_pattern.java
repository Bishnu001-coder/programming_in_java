package _3_pattern_programming;

import java.util.Scanner;
public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a the ranger for diamond");
        int num=sc.nextInt();
        //first loop
        for(int i=1;i<=num;i++){
            // for spaces
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=(2*i)-1;st++){

                if(st==1 || st==(2*i)-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //second loop
        for(int i=num;i>=1;i--){
            for(int sp=1;sp<=num-i+1;sp++){
                System.out.print(" ");
            }

            for(int st=1;st<=(2*i)-1;st++){
                if(st==1 || st==(2*i)-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


}
