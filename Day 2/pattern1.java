/*

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       String str="@?<";
       for(int i=0;i<str.length();i++)
       {
        for(int j=0;j<=str.length();j++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();

       }
    }
} 
    
*/

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
       String str="@?<";
       int n=str.length();
       for(int i=2;i>=0;i--)
       {
        for(int j=0;j<n;j++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println();
       }
    }
}



