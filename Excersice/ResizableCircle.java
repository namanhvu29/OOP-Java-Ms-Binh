public class ResizableCircle extends Circle implements Resizable {

    // Constructor
    public ResizableCircle(double radius){
        super(radius);
    }
    public ResizableCircle() {
        super();
    }

    // Method resize
    public void resize(int percent) {
        radius = radius * (double)percent / 100;
    }
}
