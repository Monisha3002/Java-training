/*Game of Strengths
Andrew is very fond of Maths. He has N boxes with him,in each box there is some value which represents the Strength of the Box.The ith box has strength A[i]. 
He wants to calculate the Overall Power of the all N Boxes.
Overall Power here means Sum of Absolute Difference of the strengths of the boxes(between each pair of boxes) multiplied by the Maximum strength among N boxes.
Input
First line contains the number of boxes N. It is followed by a line containing N elements where ith element is the strength of Andrew's ith box.
Output
A single number, which is the Overall Power.
Example:
Input;
3
4 5 3
Output:
20
Explanation;
Absolute difference between each pair calculation
(4,5)=1,(4,3)=1,(5,3)=2
sum of absolute difference between each pair of boxes is 4. So Overall Power is 20.
TestCase 1
Command Line Input

Runtime Line Input
3
4 5 3
Output
20
TestCase 2
Command Line Input

Runtime Line Input
5
4 5 3 2 1
Output
100
TestCase 3
Command Line Input

Runtime Line Input
4
100 100 10 10
Output
36000
TestCase 4
Command Line Input

Runtime Line Input
4
10001 1 1 1
Output
300030000
TestCase 5
Command Line Input

Runtime Line Input
8
1 2 3 4 5 6 7 8
Output
672
TestCase 6
Command Line Input

Runtime Line Input
5
1 1 1 1 1
Output
0 */

import java.util.Scanner;
public class game_of_strengths {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] strength=new int[n];
        for(int i=0;i<n;i++){
            strength[i]=s.nextInt();
        }
        int max_strngth=Integer.MIN_VALUE;
        for(int s1:strength){
            if(s1>max_strngth)
            {
                max_strngth=s1;
            }
        }
        int diff=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
             diff+=Math.abs(strength[i]-strength[j]);
            }
        }

        int power=diff*max_strngth;
        System.out.println(power);
    }
    
}
