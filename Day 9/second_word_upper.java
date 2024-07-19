/*Read second word and change to Upper Case
Write a java program that takes as input a string (sentence), and returns its second word in uppercase.
Example:
If input1 is “Wipro Technologies Bangalore” the function should return TECHNOLOGIES.
Note 1: if input1 is a sentence with less than two words the function should be written the word “LESS” */
import java.util.Scanner;
public class second_word_upper {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] arr=str.split(" ");
        if(arr.length<2){
            System.out.println("LESS");
        }
        else{
            System.out.println(arr[1].toUpperCase());
        }
    }
}
