/*Design Following pattern
Input :
4
Output:
A
AB
ABA
ABAB*/
import java.util.Scanner;
public class ABpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j%2==0){
                    System.out.print("A");
                }
                else{
                    System.out.print("B");
                }
           
            }
            System.out.println();
        }

        
    }
}
