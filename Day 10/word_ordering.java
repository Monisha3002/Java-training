/*Words ordering
John wants to learn alphabet ordering. He was given a task of ordering the alphabets within a word in a given string 
Input : hello java
Output : ehllo aajv

Note: Assume the minimum word size is two. */
import java.util.Scanner;
public class word_ordering {
    public static String sorting(String str)
    {
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if((int)arr[i]>(int)arr[j]){
                       char temp;
                       temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                }
            }
        }
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=Character.toString(arr[i]);
        }
return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] spl=str.split(" ");
        for(int i=0;i<spl.length;i++){
            String result=sorting(spl[i]);
            System.out.print(result+" ");

        }
    }
    
}
