//print repeated elements in sorted array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class repeatedelements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
ArrayList<Integer> arr_list=new ArrayList<Integer>();
      
        
      
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               
                if(arr[i]==arr[j])
                {
                   
                    if(!arr_list.contains(arr[i]))
                    {
                        arr_list.add(arr[i]);
                    }
                   
                  
                }
            }
        }

        for(int i=0;i<arr_list.size();i++)
        {

            System.out.println(arr_list.get(i));
        }
    


    }
}
