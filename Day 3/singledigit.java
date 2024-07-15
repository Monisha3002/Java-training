/*Write a Java program to find the sum of all the digits in a given number until it becomes a single digit?
Input :
435
Output :
3
Explanation : 
4+3+5=12
1+2=3 ans. */

import java.util.Scanner;

class singledigit {

    public static int sumofdigit(int n)
    { 
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(sum<10)
        {
            return sum;
        }
        else
        {
            return sumofdigit(sum);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=sumofdigit(n);
        System.out.println("Result:"+result);
    }
}