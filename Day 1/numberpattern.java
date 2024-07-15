import java.util.Scanner;
public class numberpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=num+i-1;j>=num;j--)

            {
                System.out.print(j+" ");
            }
            System.out.println();
            num+=i;
        }
    }
}
