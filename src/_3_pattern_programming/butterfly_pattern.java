package _3_pattern_programming;

import java.util.Scanner;

public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
            for (int st = 1; st <= i; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= 2 * (num - i); sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-1; i >=1; i--) {
            for (int st = 1; st <= i; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= 2 * (num - i); sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
