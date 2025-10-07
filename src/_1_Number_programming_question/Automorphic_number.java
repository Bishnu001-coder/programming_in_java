package _1_Number_programming_question;
import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for checking a number is automorphic number or not");
        int number = sc.nextInt();


        if (number < 0){
            System.out.println("enter a valid number and positive");
        }

        int square = number * number;

        int pow10 = 1;
        int temp = number;
        if (temp == 0) pow10 = 10;
        else {
            while (temp > 0) {
                pow10 *= 10;
                temp /= 10;
            }
        }

        if (square % pow10 == number) {
            System.out.println("it is an automorphic number");
        } else {
            System.out.println("it is not an automorphic number");
        }
    }
}
