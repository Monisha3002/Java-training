
import java.util.*;
public class stable_unstable {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        int[] fr=new int[arr.length];
        int count=1;
        int visited=-1;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                count++;
                fr[j]=visited;
                }
            }
        if(fr[i]!=visited)
        {
            fr[i]=count;
        }
    }
    for(int i=0;i<fr.length;i++)
    {
        if(fr[i]!=visited)
        {
            System.out.println(arr[i]+" "+fr[i]);
        }
    }
    }
}
