
import java.util.Scanner;

public class permutations {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str = obj.nextLine();
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(rem, prefix + str.charAt(i));
            }
        }
    }
}
