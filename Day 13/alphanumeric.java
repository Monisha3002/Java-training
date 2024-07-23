/*You are given a string consisting of alphanumeric letters.,The problem is to find the good number. A good number is a number divisible by itself 
and one(Prime number), so you have to count all the good numbers and in that set of good number you have to find the maximum good numbe
Input: The first line of input contains a string consisting of lowercase letters and digits.
Output: Print two space separated integers, denoting the count(all the primes) and the maximum prime number in the string.
Note: If the given string does not contain the prime number, then print the count as 0 and maximum prime as -1
Example:
Input: dr15t17rq7tu29lu11yk4
Output: 4  29
Explanation:
The numbers hiding in string are [15,17,7,29,11,4]. Count of good number:4, Maximum good number : 29
TestCase 1
Command Line Input

Runtime Line Input
sd5f7a9s4d2fas2
Output
4 7
TestCase 2
Command Line Input

Runtime Line Input
dr15t17rq7tu29lu11yk4
Output
4 29
TestCase 3
Command Line Input

Runtime Line Input
dr6ed8op9
Output
0 -1
TestCase 4
Command Line Input

Runtime Line Input
101d6
Output
1 101
TestCase 5
Command Line Input

Runtime Line Input
a5a2a3a7a11aaaaa101
Output
6 101
TestCase 6
Command Line Input

Runtime Line Input
dra
Output
0 -1 */
import java.util.Scanner;
public class alphanumeric {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int index=0,count=0,count1=0,max=0;
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
            {
                if(i+1<str.length() && Character.isDigit(str.charAt(i+1)))
                {
                arr[index]=(Character.getNumericValue(str.charAt(i))*10)+(Character.getNumericValue(str.charAt(i+1)));
                i++;
                }
        
                else
                {
                    arr[index]=Character.getNumericValue(str.charAt(i));
                }
                index++;
                
            }

            
    }
    for(int j=0;j<index;j++){
        if(isprime(arr[j])){
       count++;
        }
        else{
            count1=0;
        }
    }
    System.out.print(count+" ");

    for(int k=0;k<index;k++){
        if(isprime(arr[k]))
        {
             if(arr[k]>max)
             {
                max=arr[k];
             }
        }
        else{
            max=-1;
        }
    }
    System.out.print(max);

}

public static boolean isprime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
