/*Write a Java program that checks if two given strings are anagrams of each other. Describe the approach and any data structures you use. */
import java.util.Arrays;
import java.util.Scanner;
public class anagram
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Boolean result=Arrays.equals(arr1,arr2);
        if(result){
            System.out.println(str2);
        }
        else{
            System.out.println("Not anagram");
        }

    }
}