package RANGE_NUMBER_PROBLEMS;
import java.util.Scanner;
public class RANGE_1_PRIME_NUMBER {
     static boolean isprime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num % 2==0) return false;
        for(int i=3;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
         }
        return true;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start point");
        int start=sc.nextInt();
        if(start==1){
            System.out.println("enater the range from 2");return; }
        System.out.println("enter the end point");
        int end=sc.nextInt();
        boolean flag=false;
        System.out.println("prime number in the given range");
        if(start>end) {
            int t=start;
             start=end;
             end=t;
               }

        for(int i=start;i<=end;i++){
                    if(isprime(i)){
                        System.out.println(i);
                        flag=true;
                    }
                }

                if(!flag){
                    System.out.println("no prime in the range");
                }
    }

}
