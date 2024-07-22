//Input: 2a3b1c
//output: aabbbc
import java.util.Scanner;
public class lettercount {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String str1="";
        for(int i=0;i<str.length();i+=2)
        {
            int count=Character.getNumericValue(str.charAt(i));
            char ch=str.charAt(i+1);
            for(int j=0;j<count;j++)
            {
                str1+=ch;
            }
        }
        System.out.print(str1);
    }
}
