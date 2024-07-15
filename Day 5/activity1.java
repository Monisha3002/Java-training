//String 1 and 2...Reverse string 2 and concat with string 1
import java.util.Scanner;
public class activity1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        char[] arr2=str2.toCharArray();
        int n=arr2.length;
        System.out.print(str1);

        for(int j=arr2.length-1;j>=0;j--)
        {
            System.out.print(arr2[j]);
        }  
    }
}
