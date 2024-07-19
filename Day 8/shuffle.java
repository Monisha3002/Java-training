/*Valid shuffle of two String

One more difficult String algorithm based coding question for senior developers. You are given 3 strings: first,  
second, and  third.  third String is said to be a shuffle of first and second if it can be formed by interleaving 
the characters of first and second String in a way that maintains the left to right ordering of the characters from each string.
Sample input and output: 1
First input = "abc"
Second input= "def"
Third input = "dabecf"
Output: True
Explanation: It is a valid shuffle since it preserves the character ordering of the two strings. So, given these 
3 strings write a function that detects whether third String is a valid shuffle of first and second String.
Sample input and output: 2
First input = "abc"
 Second input= "def"
Third input = "dakecf"
Output: False */
import java.util.Scanner;
public class shuffle {
    public static boolean isvalid(String str1,String str2,String str3)

    {
      for(int i=0;i<str3.length();i++)
      {
           if(i%2==0)
           {
            System.out.print(str3.charAt(i)+"");
           }
      }
      return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String str3=s.nextLine();
        boolean result=isvalid(str1,str2,str3);
        System.out.println(result);

    }
}
