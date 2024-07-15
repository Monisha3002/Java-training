import java.util.Scanner;
public class highestdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0;
        while(n>0)
        {

           int rem=n%10;  //remainder 
           max=(int)Math.max(rem,max);
           n=n/10;
           
        }
        System.out.println(max);
    }
}
