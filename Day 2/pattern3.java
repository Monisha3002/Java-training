
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1)
                {
                    System.out.print("@");
                }
                else if(i==2)
                {
                    System.out.print("?");
                }
               
                else
                {
                    System.out.print(">");
                }
            }
            System.out.println();
        }
    }
}
