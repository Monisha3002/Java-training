/*Design following pattern
Input : 
5
Output :
1
11
121
1221
12221 */
import java.util.Scanner;
public class num_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                    System.out.print("1");
            }
            else
            {
                System.out.print("1");
            
            for(int j=1;j<=i-2;j++)
            {
                System.out.print("2");
            }
            System.out.print("1");
        }
        System.out.println();
    }
}
}
