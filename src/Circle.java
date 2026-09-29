

/**
 * Refined Abstraction: Circle shape.
 * Delegates actual drawing to the internal Renderer reference.
 */
public class Circle extends Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius, Renderer renderer) {
        super(renderer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius); // Delegation
    }
}