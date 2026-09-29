

/**
 * Concrete Implementor: renders shapes as raster pixels.
 */
public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.println("Drawing circle as pixels at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square as pixels with side length " + side);
    }
}