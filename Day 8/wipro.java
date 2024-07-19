import java.util.Scanner;
public class wipro {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int num1=s.nextInt();
       int num2=s.nextInt();
       int num3=s.nextInt();
       int a=num1/1000;
       int b=(num2/100)%10;
       int c=(num3/10)%10;
       System.out.println("Result:"+ (a*b-c));
      
   } 
}
