package Number_programming_question;
import java.util.Scanner;
public class fibonacii_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;


        int num= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=num;i++){
            int c=a+b;
            System.out.println(c);
        a=b;
        b=c;
        }
    }
}
