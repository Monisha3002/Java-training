/*
 Write code to print the following pattern for the given input number N.
Example:
5
Output:
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
 */
import java.util.Scanner;
public class tables_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
