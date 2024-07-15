
import java.util.Scanner;
public class swapdigitnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
         for(int i=0;i<n;i++)
        {
          int rem=(arr[i]%10)*10;
          int first=arr[i]/10;
          System.out.println(first+rem);
           
        }
      
    }
}
