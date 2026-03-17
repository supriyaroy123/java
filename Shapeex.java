// Calculate area and perameter of reactangle and circle.
import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Rectangle implements Shape {
    double l, w;
    Rectangle(double l, double w) { 
        this.l = l; 
        this.w = w; 
    }

    public double getArea() { 
        return l * w; 
    }
    public double getPerimeter() { 
        return 2 * (l + w); 
    }
    
}

class Circle implements Shape {
    double r;
    Circle(double r) { 
        this.r = r; 
    }

    public double getArea() { 
        return 3.14 * r * r; 
    }
    public double getPerimeter() { 
        return 2 * 3.14 * r; 
    }
}

public class Shapeex
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = scanner.nextDouble();

        Rectangle r = new Rectangle(length, width);
        System.out.println("Area of Rectangle is:"+r.getArea());

        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();

        Circle c = new Circle(radius);
        System.out.println("Area of Circle is:"+c.getArea()); 
    }
}
