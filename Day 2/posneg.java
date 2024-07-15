import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<0)
        {
            for(int i=n;i<=0;i++)
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            for(int i=0;i<=n;i++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
