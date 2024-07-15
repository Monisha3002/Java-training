//circle,rectangle,triangle interface....get area
interface shape
{
    double getArea();
}

class Circle implements shape{
    public double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle implements shape{
    public float length;
    public float breath;
    public Rectangle(float length,float breath)
    {
        this.length=length;
        this.breath=breath;
    }
    public double getArea()
    {
        return length*breath;
    }
}

class Triangle implements shape
{
    public double height;
    public double breath;
    public Triangle(double height,double breath)
    {
        this.height=height;
        this.breath=breath;
    }
    public double getArea()
    {
        return 0.5*breath*height;
    }
}

public class Shapes{
    public static void main(String[] args) {
       shape circle=new Circle(5);
       shape rectangle=new Rectangle(4,6);
       shape triangle=new Triangle(3, 4);
       System.out.println("Circle area:"+circle.getArea());
       System.out.println("Rectangle area:"+rectangle.getArea());
       System.out.println("Triangle area:"+triangle.getArea());
    }
}

