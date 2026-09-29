public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        // Combination 1: Circle with VectorRenderer
        Shape circleVector = new Circle(5.0, 10.0, 3.5, vectorRenderer);

        // Combination 2: Circle with RasterRenderer
        Shape circleRaster = new Circle(5.0, 10.0, 3.5, rasterRenderer);

        // Combination 3: Square with VectorRenderer
        Shape squareVector = new Square(4.0, vectorRenderer);

        System.out.println("=== Demonstrating at least 3 Shape x Renderer combinations ===");
        circleVector.draw();
        circleRaster.draw();
        squareVector.draw();

        System.out.println("\n=== Demonstrating Runtime Switch of Renderer ===");
        Shape dynamicSquare = new Square(12.0, vectorRenderer);
        dynamicSquare.draw(); // Draws as vector

        // Changing implementation dynamically at runtime without modifying Shape object
        dynamicSquare.setRenderer(rasterRenderer);
        dynamicSquare.draw(); // Now draws as raster
    }
}