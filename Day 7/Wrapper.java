public class Wrapper {
    public static void main(String[] args) {
        
        //Integer
        Integer i1 = Integer.valueOf(23); 
        int a=i1.intValue();
        System.out.println(a);

        //Double
        Double d1 = Double.valueOf(2.55);
        int b = (int) d1.doubleValue(); // Cast to int
        System.out.println(b);

        //char
        Character c1=Character.valueOf('c');
        char c=c1.charValue();
        System.out.println(c);

        //Float
        Float f1=Float.valueOf(5.44f);
        float f2=f1.floatValue();
        System.out.println(f2);

        //Short
        Short s1 = Short.valueOf((short) 20);
        short s2 = s1.shortValue();
        System.out.println(s2); 
          
       //boolean
       Boolean b1=Boolean.valueOf(true);
       boolean b2=b1.booleanValue();
       System.out.println(b2);

       //Byte
       Byte by1=Byte.valueOf((byte)80);
       byte by2=by1.byteValue();
       System.out.println(by2);

       //Long
       Long l1=Long.valueOf(39);
       long l2=l1.longValue();
       System.out.println(l2);
       

    }
}

        