
import java.util.Scanner;
class pattern4
{
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        char c='E';
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(c+" ");
            }
            c--;
            System.out.println();
        }
        
    }
}