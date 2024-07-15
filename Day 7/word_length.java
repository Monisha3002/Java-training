//input sentence....print word length.and print even word
import java.util.Scanner;
public class word_length {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       String[] arr= str.split(" ");

        for(String a:arr){
            System.out.println(a+":"+a.length());
        }

        System.out.println();
        System.out.println("Even letter word:");
        for(String a:arr){
        if(a.length()%2==0)
        {
            System.out.println(a);
        }
    }


       
    }
}
