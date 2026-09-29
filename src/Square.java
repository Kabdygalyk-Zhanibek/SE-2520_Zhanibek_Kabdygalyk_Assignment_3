
/**
 * Refined Abstraction: Square shape.
 * Delegates actual drawing to the internal Renderer reference.
 */
public class Square extends Shape {
    private double side;

    public Square(double side, Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side); // Delegation
    }
}