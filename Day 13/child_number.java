/*Child Number
We say that a d-digit positive number (no leading zeros) is a one-child number if exactly one of its sub-strings is divisible by d.
For example, 5671 is a 4-digit one-child number. Among all its sub-strings 5, 6, 7, 1, 56, 67, 71, 567, 671 and 5671, only 56 is divisible by 4.
If the given number is one-child number then print "one-child number", otherwise print "Not a one-child number"
Input:
  A line contains a positive number.
Output:
A line contains "one-child number" if the given positive number is one-child number, otherwise it contains "Not a one-child number"
 */
import java.util.Scanner;
public class child_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(ischild(n))
        {
            System.out.println("one child number");
        }
        else{
            System.out.println("Not one child number");
        }
    }
    public static boolean ischild(int num){
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String substr=str.substring(i,j);
                int res=Integer.parseInt(substr);
                if(res%4!=0){
                    return false;
                }
            }
        }
        return true;
    }
}