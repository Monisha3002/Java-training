import java.util.*;
public class evenacii {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            String input = obj.nextLine();  
    
            for (int i = 0; i < input.length(); i++) { 
                    char ch = input.charAt(i);
                    int ascii = (int) ch;
                    if(ascii % 2==0)
                    {
                    System.out.println(ch + ": " + ascii);
                }
            }
        }
    }
