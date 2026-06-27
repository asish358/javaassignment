class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() { // instance method, not static
        return length * width;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(3, 7);

        System.out.println("Area of r1: " + r1.area()); // 50
        System.out.println("Area of r2: " + r2.area()); // 21
    }
}

