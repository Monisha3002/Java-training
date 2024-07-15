/*  Write a program which takes takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing the number of days to simulate. 
An integer value of 1 represents an active cell and value of 0 represents an inactive cell. 
Input Format:
First line contains 8 elements
second line contains an integer representing the number of days to simulate
Output format:
A line contains resultant array
Example 1:
Input
1 0 0 0 0 1 0 0
1 
Output
0 1 0 0 1 0 1 0 */
import java.util.Scanner;
public class active_inactive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter no of days to simulate");
        int days=s.nextInt();
        
        for(int day=0;day<days;day++)
        {
          int[] newarray=new int[n];
          for(int i=0;i<n;i++)
          {
            int left=(i>0)?arr[i-1]:0;
            int right=(i<7)?arr[i+1]:0;
            if((left==1 && right==1) || (right==0 && left==0))
            {
                newarray[i]=0;
            }
            else
            {
                newarray[i]=1;
            }
          }

    
        for(int i=0;i<n;i++)
        {
            arr[i]=newarray[i];
        }
        for(int i=0;i<n;i++)
        {

            System.out.print(arr[i]+" ");
        }
    }
}
}
