/* 
1    5
  2 4
   3
  2 4
1    5
*/

import java.util.Scanner;
public class numpatterndiagnol {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
          {
            if(i==j)
            {
              System.out.print("1");
            }
            else if(j==n-i+1){
              System.out.print("2");
            }
            else{
              System.out.print(" ");
            }
            
          }
          System.out.println();
        }
    }
}
