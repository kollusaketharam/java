
abstract class Shape {
    int dimension1, dimension2;


    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

   
    abstract void printArea();
}


class Rectangle extends Shape {

    public Rectangle(int length, int width) {
        super(length, width);     }


    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {

    public Triangle(int base, int height) {
        super(base, height); 
    }

    
        void printArea() {
        double area = 0.5 * dimension1 * dimension2; 
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {

    public Circle(int radius) {
        super(radius, 0);     }

   
    
    void printArea() {
        double area = Math.PI * dimension1 * dimension1; 
        System.out.println("Area of Circle: " + area);
    }
}


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape triangle = new Triangle(4, 6);
        Shape circle = new Circle(7);

      
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
