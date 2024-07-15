/*Write a program to accept a string from the user. Count and print the number of times each character occurs in the given string.
Example –
 Input : malayalam
Output must be –
m – 2
a – 4
l – 2
y – 1 */

import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        boolean visited[]=new boolean[str.length()];
        for(int i=0;i<arr.length;i++)
        {
            if(!visited[i])
            {
            char currentelement=arr[i];
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(currentelement==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(currentelement+"-"+count);
        }
    }

    }
}