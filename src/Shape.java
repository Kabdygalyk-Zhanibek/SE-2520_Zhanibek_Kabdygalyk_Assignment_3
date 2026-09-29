
/**
 * High-level Abstraction.
 * Maintains a reference to a Renderer implementation object (Bridge link).
 */
public abstract class Shape {
    protected Renderer renderer; // Composition link

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}