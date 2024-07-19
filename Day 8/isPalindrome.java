import java.util.Scanner;
class isPalindrome
{
    public static void main(String arg[])
    {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        String str=String.valueOf(n);
        boolean ans=false;
        String ans1="";
        for(int i=0;i<str.length();i++)
        {
            ans=isTrue(str.substring(0,i)+str.substring(i+1));
            if(ans)
            {
            ans1=ans1+str.substring(i,i+1);
            break;
            }
        }
        int a=Integer.parseInt(ans1);
        System.out.println(a);
    }
    public static boolean isTrue(String str)
    {
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
    rev=rev+str.substring(i,i+1);
}

if(rev.equals(str))
{
    return true;
}
return false;
    }
}