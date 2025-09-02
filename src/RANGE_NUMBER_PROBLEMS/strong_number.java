package RANGE_NUMBER_PROBLEMS;
import java.util.Scanner;
public class strong_number {
  static   boolean  isstrong(int num){
      int orginal=num;
      int digit;
      int sum=0;
      while(orginal>0){
          digit=orginal%10;
          int fact=1;
          for(int i=1;i<=digit;i++){
              fact*=i;
          }
          sum+=fact;
          orginal/=10;
      }
      return sum==num;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start and end number");
        int st=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("the strong number in range");
        for(int i=st;i<=end;i++){
            if(isstrong(i)){
                System.out.println(i);
            }
        }
    }
}
