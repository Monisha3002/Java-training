//Sentence inpit..print first letter in each word
import java.util.Scanner;
public class first_letter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       String[] arr= str.split(" ");
        for(String a:arr){
            System.out.println(a);
        }
        System.out.println("Output:");
        for(String a:arr){
            System.out.println(a.charAt(0));
        }
    }
}
