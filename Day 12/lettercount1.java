//aabbbc
//2a3b1c
import java.util.Scanner;

public class lettercount1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        String str1="";
        int count=1;
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
            count++;
        }
        else
        {
            str1+=count+""+ch;
            count=1;
            ch=str.charAt(i);
        }
        }
        str1+=count+""+ch;
        System.out.print(str1);
    }
}
