class B {
    void add(int a, int b) {
        System.out.println(a + b); 
    }
    
    void add(double a, double b) {
        System.out.println(a + b); 
    }
}

public class methodoverloading extends B {
    public static void main(String[] args) {
        methodoverloading m = new methodoverloading(); 
        m.add(2, 3); 
        m.add(3.6, 7.0); 
    }
}