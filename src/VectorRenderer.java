
/**
 * Concrete Implementor: renders shapes as vector graphics.
 */
public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.println("Drawing circle as vector at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square as vector with side length " + side);
    }
}