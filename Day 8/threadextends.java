

public class threadextends extends Thread{
    public void run()
    {
        int a=10;
        int b=10;
        int result=a+b;
        System.out.print(result);
    }
    public static void main(String[] args) {
        threadextends a=new threadextends();
        a.start();
    }
}
