// create interface and fnd rateofinterest
interface PNB
{
    public void rateofinterest();
}

 interface SBI
{
    public void rateofinterest();
}

class PNB1 implements PNB{
public void rateofinterest()
{
    System.out.println("PNB");
}
}

class SBI1 implements SBI
{
public void rateofinterest()
{
System.out.println("SBI");
}
}

public class bank
{
    public static void main(String[] args) {
        PNB1 obj=new PNB1();
        obj.rateofinterest();
        SBI1 obj1=new SBI1();
        obj1.rateofinterest();
    }
}

