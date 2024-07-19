/*Find Password:
Detective Buckshee Junior has been approached by the shantiniketan kids society for help in finding the password to the games complex. 
After hearing the scenario, detective Buckshee junior realises that he will need a programmer’s support.  He contacts you and requests your help.
 Please help the detective by writing a function to generate the password
The scenario is as below:
Five numbers are available within the kids.
These numbers are either stable or unstable.

A number is stable if each of its digit occur the same number of times. i.e. the frequency of each digit in the number is the same.
  For e.g. 2277, 4004, 11, 23,  583835, 1010 are examples of stable numbers.
Similarly, A number is unstable if the frequency of each digit in the number is NOT same. .  For e.g.  221, 4314, 101, 233, 58135, 101 are examples 
of unstable numbers.
The password can be found as follow:
i.e. password=sum of all stable numbers- sum of all unstable numbers
Assuming that five numbers are passed to a function as input1, input2, input3, input4, input5 complete the function to find and return the password.
For example:
If input1=12, input2=1313, input3=122, input4=678, input5=898.
Stable numbers are 12, 1313 and 678.
Unstable numbers are 122 and 898.
So, the password should be= sum of all stable numbers- sum of all unstable numbers=983 */
import java.util.Scanner;
class find_password{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      
       int a1=s.nextInt();
       int a2=s.nextInt();
       int a3=s.nextInt();
       int a4=s.nextInt();
       int a5=s.nextInt();
       int res=findpass(a1, a2,a3,a4,a5);
       System.out.println(res);
        
     }

     public static int findpass(int input1, int input2, int input3, int input4, int input5) {
      int[] inputs = {input1, input2, input3, input4, input5};
      int stableSum = 0;
      int unstableSum = 0;

      for (int number : inputs) {
          if (isStable(number)) {
              stableSum += number;
          } else {
              unstableSum += number;
          }
      }

      return stableSum - unstableSum;
  }


  private static boolean isStable(int number) {
   int[] digitCount = new int[10];

   while (number > 0) {
       int digit = number % 10; 
       digitCount[digit]++;
       number /= 10; 
   }


   int frequency = -1;
   for (int count : digitCount) {
       if (count > 0) {
           if (frequency == -1) {
               frequency = count; 
           } else if (frequency != count) {
               return false; 
           }
       }
   }

   return true;
}
}

    
   

