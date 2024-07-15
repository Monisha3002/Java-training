

public class Exception extends java.lang.Exception{
      public static void main(String[] args) {
        try{
          String s=null;
          char ch=s.charAt(3);
           System.out.println(ch);

        }
        catch(NullPointerException e){
            System.out.print("NullPointer Exception:"+e.getMessage());
        }

      }
}
