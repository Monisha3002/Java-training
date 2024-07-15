import java.util.Scanner;
public class Statement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        //count of words
        int count=0;
        String[] arr=str.split(" ");
        for(String word:arr)
        {
            count++;
        }
        System.out.println("Count of words:"+count);


        //Start,end with vowels count

        int count_vowel=0;
        String c="aeiou";
        for(String word:arr)
        {
            if(c.contains(word.charAt(0)+"") || c.contains(word.charAt(word.length()-1)+""))
            {
                count_vowel+=1;
            }
          
        }
        System.out.println("Count of vowels:"+count_vowel);

        //In word how many vowels
        
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i].length();
            int counter=0;
            for(int j=0;j<n;j++)
            {
                if(c.contains(arr[i].charAt(j)+"")){
                   counter++;
                }
            }
            System.out.println(arr[i]+"-"+counter);
        }

    }

}
