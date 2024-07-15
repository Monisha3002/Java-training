/*Write a Java program that accepts strings and returns the string with all vowels (‘a’, ‘e’, ‘i’, ‘o’, ‘u’) replaced with ‘z’.
For Example:
Input : hello world
Output : hzllz wzrld */
import java.util.Scanner;
public class replaceall {
    public static String repeat(String str)
    {
        String result=str.replaceAll("[aeiouAEIOU]","z");
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=repeat(str);
        System.out.println(result);
    }
}
