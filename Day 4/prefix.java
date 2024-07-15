/* Implement a Java function to find the longest common prefix string amongst an array of strings.
 If there is no common prefix, return an empty string "". */
class Prefix
{
public static String longestprefix(String[] str)
{
    String prefix=str[0];
    for(int i=1;i<str.length;i++)
    {
        while(str[i].indexOf(prefix)!=0)
        {
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty())
            {
                return "";
            }
        }
    
   
   }
   return prefix;
}
public static void main(String[] args) 
{
    String[] str = {"flower", "flow", "flight"};
    System.out.println("Longest common prefix: " + longestprefix(str));
}
}
