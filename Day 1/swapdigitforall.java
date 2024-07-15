
import java.util.Scanner;
public class swapdigitforall {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
         
        for(int i=0;i<n;i++)
         {
         int value=0;
         
          while(arr[i]!=0)
          {
        
          value=(value*10)+(arr[i]%10);
          arr[i]=arr[i]/10;
          }
          System.out.println(value);
        }
    }
}


