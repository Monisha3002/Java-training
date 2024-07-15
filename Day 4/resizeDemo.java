interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);

class Rectangle implements Resizable {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }
    
    public void printDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
public class resizeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Original dimensions:");
        rectangle.printDimensions();
        rectangle.resizeWidth(8);
        rectangle.resizeHeight(15);
        System.out.println("\nResized dimensions:");
        rectangle.printDimensions();
    }
}
}
