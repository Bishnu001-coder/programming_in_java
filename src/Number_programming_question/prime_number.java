package Number_programming_question;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for checking");
         int num=sc.nextInt();
         boolean flag=true;
         for(int i=2;i<num/2;i++){
             if(num%i==0){
                 flag=false;
                 break;
         }
    }
      if(flag){
          System.out.println("it is a prime number");
      }else{
          System.out.println("it is not a prime number");
      }
    }
}
