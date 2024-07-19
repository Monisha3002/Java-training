import java.util.*;
public class vowels {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
            {
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}
