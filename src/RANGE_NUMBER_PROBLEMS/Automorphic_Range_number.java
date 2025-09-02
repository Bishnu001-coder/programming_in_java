package RANGE_NUMBER_PROBLEMS;
import java.util.Scanner;
public class Automorphic_Range_number {
    static boolean isAutomorphic_number(int num){
        int orginal=num;
        int sqrt=num*num;
        int last_digit;
        int power=1;
        while(power<=orginal){
            power*=10;
        }
        last_digit=sqrt%power;
        return num==last_digit;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start number and end number");
        int st=sc.nextInt();
        int end=sc.nextInt();
        for(int i=st;i<=end;i++){
            if(isAutomorphic_number(i)){
                System.out.println(i);
            }
        }
      }
}
