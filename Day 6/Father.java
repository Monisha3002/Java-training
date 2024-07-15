//Hybrid inheritane
//Single
class grandfather
{
    void showG(){
        System.out.println("I am grandfather");
    }
}

class Father extends grandfather
{
    void showF(){
        System.out.println("I am father");
    }
}

//hierarchical
class Son extends Father{
    void showS(){
        System.out.println("I am Son");
    }
}

class Daughter extends Father{
    void showD(){
        System.out.println("I am Daughter");
    }

     
    public static void main(String[] args) {
        Son s=new Son();
        s.showF();
        s.showS();
        s.showG();
        Daughter d=new Daughter();
        d.showF();
        d.showD();
        d.showG();
    }

}