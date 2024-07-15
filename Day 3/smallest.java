import java.util.Scanner;
public class smallest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int max=0;
           while(n!=0)
           {
            int digit=n%10;
            if(digit<max)
            {
                max=digit;
            }
            n=n/10;
            
           }
           System.out.print(max);
        }
    }
}
