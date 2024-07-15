import java.util.Scanner;
  public class frequencystring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
              if(!visited[i])
              {
                int count=1;
                char currentelement=arr[i];

                for(int j=i+1;j<arr.length;j++)
                {
                    if(currentelement==arr[j])
                    {
                        count+=1;
                        visited[j]=true;
                    }
                    else{
                      break;
                    }
                    
                }
                System.out.print(currentelement);
                System.out.print(count);
                
                
               
              }
             
              
        }
        
        
    }
}


