/* String PA17B3
 * Output-20
 */

import java.util.Scanner;
public class task {

    public static void main(String[] args) {
        int sum=0;
        Scanner s=new Scanner(System.in);
        String str=s.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
            {
                if(i<str.length()-1 && Character.isDigit(str.charAt(i+1)))
                {
                    sum+=Integer.parseInt(str.substring(i,i+2));
                    i++;
                }
                else{
                    sum+=Character.getNumericValue(str.charAt(i));
                }
            }
        } 
        System.out.println("Sum:"+sum);
    }
}
