package Number_programming_question;

import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int divisible_digit = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                divisible_digit += i;
            }
        }

        if (num == divisible_digit) {
            System.out.println("it is a perfect number");
        } else {
            System.out.println("it is not a perfect number");
        }
    }
}

