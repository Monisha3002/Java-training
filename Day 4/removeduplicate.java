//Remove duplicate in the string
import java.util.Scanner;
public class removeduplicate {
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    char[] arr=str.toCharArray();
    boolean[] visited=new boolean[arr.length];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                visited[i]=true;
                visited[j]=true;
            }
        
        }
       
    }
    for(int i=0;i<arr.length;i++){
       if(!visited[i])
       {
        System.out.print(arr[i]);
       }
    }

    }
}
