package _1_Number_programming_question;

import java.util.Scanner;

public class LCM_and_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=1;
        //this for hcf
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("hcf value is = "+hcf);
        //this for the lcm
        int lcm=(a*b)/hcf;
        System.out.println("the lcm value is  = "+lcm);
    }
}
