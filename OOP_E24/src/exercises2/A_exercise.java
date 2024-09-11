/*
Write three classes to represent circles, squares, and rectangles.
A circle has a radius, a square has a width, and a rectangle has both a
width and height. Ensure that each class has a constructor that takes these
arguments. Add a method to each class to compute its circumference and
area
 */
public class A_exercise {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Square s = new Square();

        r.setHeight(10);
        r.setWidth(10);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        c.setRadius(10);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        s.setWidth(10);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
    }
}


class Circle {
    private double radius;

    Circle() {
        this.radius = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square {
    private double width;

    Square() {
        this.width = 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 2 * width * width;
    }
}

class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width * height;
    }
}