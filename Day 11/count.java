
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        char[] arr=str.toCharArray();

        int count_upper=0,count_lower=0,count_number=0,count_space=0,count_splch=0,count_vowels=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90))
            {
                count_upper++;
            }
            else if(((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122))
            {
                count_lower++;
            }
            else if(str.charAt(i)>=48 && str.charAt(i)<=59)
            {
                count_number++;
            }
            else if(Character.isWhitespace(arr[i]))
            {
                count_space++;
            }
            else
            {
                count_splch++;
            }
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='A' 
            ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                count_vowels++;
            }
        }
        System.out.println("Uppercase"+" "+count_upper);
        System.out.println("Lowercase"+" "+count_lower);
        System.out.println("Numbers"+" "+count_number);
        System.out.println("Space"+" "+count_space);
        System.out.println("Special Character"+" "+count_splch);
        System.out.println("vowels"+" "+count_vowels);


    }
}
