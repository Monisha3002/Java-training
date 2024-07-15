/* For any input number N, print the trapezium pattern
Example:
If N = 4

1*2*3*4*17*18*19*20
  5*6*7*14*15*16
    8*9*12*13
      10*11
      
 */
import java.util.Scanner;
public class trapezium {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num=1;
    int n=s.nextInt();
    for(int i=1;i<n;i++){
     for(int j=1;j<=i;j++)
     {
      System.out.print("* ");
     }
     
     for(int k=i;k<n;k++)
     {
      System.out.print(num++ + "*");
     }
    
     for(int l=i;l<n;l++)
     {
      System.out.print(num++ + "*");
     }
      System.out.println();
    }
}
}
