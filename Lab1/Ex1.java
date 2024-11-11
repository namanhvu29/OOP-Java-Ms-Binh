public class Ex1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
