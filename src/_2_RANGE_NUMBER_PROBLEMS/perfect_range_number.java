package _2_RANGE_NUMBER_PROBLEMS;

import java.util.Scanner;

public class perfect_range_number {
    static boolean perfect_num(int num){
        int sum=0;

        for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum+=i;
             }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start and end range");
        int st=sc.nextInt();
        int end=sc.nextInt();
        for(int i=st;i<=end;i++){
            if(perfect_num(i)){
                System.out.println(i);
            }
        }
    }
}
