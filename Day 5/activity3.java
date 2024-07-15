//Input-Java
//Output-Jaav

import java.util.Scanner;
public class activity3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]);
        }

        for(int j=n-1;j>=n/2;j--)
        {
            System.out.print(arr[j]);
        }
        }

    }


