/*Design Following Pattern

Input : 4

Output :

4 3 2 1

3 2 1

2 1

1 */
import java.util.Scanner;
public class num_pattern_desc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = n; i > 0; i--) {
          
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
