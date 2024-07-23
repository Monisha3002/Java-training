/*Input :

4

Output:

* * * *

*

*  

* * * * */
import java.util.Scanner;
public class partial_square {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
           
                    System.out.print("* ");
                }
                System.out.println();

                for (int i = 1; i < n - 1; i++) {
                    System.out.println("*");
                }
                for(int i=0;i<n;i++){
           
                    System.out.print("* ");
                }
                System.out.println();
            }
           
        }
    
