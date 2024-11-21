public class Circle implements GeometricObject {

    // Attribute
    protected double radius = 1.0;

    // Contructor
    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter and Getter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    // Method getPerimeter
    public double getPerimeter() {
        double peri = 2*3.14*radius;
        return peri;
    }

    // Method getArea
    public double getArea() {
        double area = 3.14*radius*radius;
        return area;
    }
}