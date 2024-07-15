
import java.util.Scanner;

class numpattern2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            
            int start=num+(i*(i-1))/2;
            int end=start+i-1;
            for(int j=end;j>=start;j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
          
        }
    }
}
