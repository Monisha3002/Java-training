/*Happy Number
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum 
of the squares of its digits, and repeat the process until the number equals 1 or it loops endlessly in a cycle. Those numbers which
 ends in 1 are happy numbers. Note : Input should be 2 digit no.
Example 1:
Input: 19
Output: True
Explanation : 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 10
12 + 02 = 1
Example 2:
Input: 11
Output: False
Explanation : 
12 + 12 = 2
  */

  import java.util.Scanner;

  public class happy_number {
      public static boolean ishappy(int num) {
          while (num != 1 && num != 4) { 
              int sum = 0;
              while (num > 0) {
                  int digit = num % 10;
                  sum += digit * digit;
                  num /= 10;
              }
              num = sum;
          }
          return num == 1;
      }
  
      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int num = s.nextInt();
              boolean res = ishappy(num);
              if (res) {
                  System.out.println("True"); 
              } else {
                  System.out.println("False");
              }
          }
        
      }
  
  