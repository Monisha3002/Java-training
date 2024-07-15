import java.util.Scanner;
public class sentence 
{
    public static void main(String[] args) 
    {

//word count
        int count=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
         String[] arr=str.split(" ");
        for(String word:arr)
        {
        count++;

        }
        System.out.println("Words:"+count);


//Even length word
       for(String word:arr)
        {
        if(word.length()%2==0)
        {
            System.out.println("Even:"+word +" ");
        }
        } 

//only vowel
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o' || str.charAt(i)=='u')
        {
            System.out.print(str.charAt(i)+" ");
        }
      }
    }
}


