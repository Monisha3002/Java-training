

import java.util.Scanner;


public class upperlower {
    public static void main(String[] args) {
        Scanner obj=new Scanner (System.in);
        String str=obj.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
            {
                System.out.print(Character.toUpperCase(arr[i]));

            }
            else{
                System.out.print(Character.toLowerCase(arr[i]));
            }
        }
    }
}
