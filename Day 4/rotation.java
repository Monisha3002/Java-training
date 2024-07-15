/*Write a Java program to check if one string is a rotation of another. 
For example, "waterbottle" is a rotation of "erbottlewat". Discuss the logic and steps involved in your solution. */
import java.util.Scanner;
public class rotation {
    public static boolean isrotate(String str1,String str2){
        String s1s1=str1+str1;
        return s1s1.contains(str2);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        if(isrotate(str1, str2))
        {
            System.out.println(str1+" is rotation of "+str2);
        }
        else
        {
            System.out.println(str1+" is not rotation of "+str2);
        }
        
    }
}
