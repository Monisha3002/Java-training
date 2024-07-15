import java.util.Scanner;
class pattern2
{
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        char c='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
        
    }
}