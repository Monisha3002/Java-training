/*Find the one digit to be removed to form palindrome:
Assume that the given number input1 can become a palindrome if only one of its digit is removed. i.e. only one digit into the number is out of place.
 Find the digit that needs to be removed from input1 to convert input1 to a palindrome.
Example 1:input1=12332 the digit 1 is to be removed to convert input1 to palindrome.
                So, return the Output=1

Example 2:input1=251532 the digit 3 is to be removed to convert input1 to palindrome.

         So, return the Output=3

TestCase 1
Command Line Input

Runtime Line Input
12332
Output
1
TestCase 2
Command Line Input

Runtime Line Input
251532
Output
3
TestCase 3
Command Line Input

Runtime Line Input
10101
Output
-1
TestCase 4
Command Line Input

Runtime Line Input
981894
Output
4
TestCase 5
Command Line Input

Runtime Line Input
5321235
Output
-1
TestCase 6
Command Line Input

Runtime Line Input
999998
Output
8 */
import java.util.Scanner;
class remove_to_palindrome
{
    public static int digit_remove(String str){
        if(isPalindrome(str))
        {
            return -1;
        }
        for(int i=0;i<str.length();i++){
            String newstring=str.substring(0,i)+str.substring(i+1);
            if(isPalindrome(newstring)){
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
        
    }
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++){
              if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                    return false;
              }
             
            }
            return true;
    } 

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int res=digit_remove(str);
            System.out.println(res);

    }
}