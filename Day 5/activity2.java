//Compare two string if any letter present in it remove it and return the string 1
//Hello
//World
//Output-He

import java.util.Scanner;
public class activity2 {
    public static String remove(String str1,String str2)
    {
   String result="";
   for(int i=0;i<str1.length();i++)
   {
    char ch=str1.charAt(i);
   if(str2.indexOf(ch)==-1)
   {
    result+=ch;
   }
   }
   
return result;
}
    
public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String str1=s.nextLine();
            String str2=s.nextLine();
            String result=remove(str1, str2);
            System.out.print(result);
        }
       
    }


