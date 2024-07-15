/*Write a java program which accepts 2 strings from the user. Remove the character from first string which are in second string.
Example 1
Input : hello
world
Output : he
Example 2
Input : aaaa
            a
Output : null */

import java.util.Scanner;
public class removechar {
    public static String isremove(String str1,String str2){
        String result="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
           if(str2.indexOf(ch)==-1)
           {
            result+=ch;
           }

        }
        return result.isEmpty()?null:result;

    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String result=isremove(str1,str2);
        System.out.println("Output:"+result);
    }
}
