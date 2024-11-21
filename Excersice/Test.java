import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put radius: ");
        double radius = sc.nextDouble();
        ResizableCircle circle = new ResizableCircle();
        double a = circle.getArea();
        System.out.println(a);
        double b = circle.getPerimeter();
        System.out.println(b);
        circle.resize(50);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        
    }
}
