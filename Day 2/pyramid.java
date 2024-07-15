
import java.util.Scanner;

public class pyramid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row, col, space;

        for (row = 0; row <= n; row++) {

            for (space = n; space >= row; space--) {
                System.out.print("  ");
            }
            
            for(col=row;col>=0;col--)
            {
                System.out.print(col+" ");
            }
            
            for (col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}



/*import java.util.Scanner;
public class pyramid {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int row,col,space;
        
        for (row = 0; row <=n; row++) {
            
            for (space = n; space > row; space--) {
                System.out.print("  ");
            }
          
            for (col = row; col >= 0; col--) {
                System.out.print(col+" ");
            }
           
            for (col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
             

             
        
    }
}
 */
