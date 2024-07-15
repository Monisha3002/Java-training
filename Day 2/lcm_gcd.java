import java.util.Scanner;
class lcm_gcd
{
   static int gcdlcm(int n1,int n2)
    { 
        if(n2==0)
           return n1;
        else
        {
         return gcdlcm(n2, n1%n2);
        }

    }


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int gcd=gcdlcm(n1, n2);
        System.out.println("GCD:"+ gcd);
        System.out.println("LCM:"+(n1*n2)/gcd);
    }
}