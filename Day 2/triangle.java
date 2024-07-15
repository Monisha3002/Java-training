import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int s3 = s.nextInt();
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)) {
            System.out.println("Yes");
        } else {
            System.err.println("No");
        }
    }
}
