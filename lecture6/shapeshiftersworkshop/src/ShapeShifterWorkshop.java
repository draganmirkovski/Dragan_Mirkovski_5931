public class ShapeShifterWorkshop {

    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        System.out.println();

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println();

        Cube cube = new Cube(2);
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("\nAll shapes have been created and their properties displayed!");
    }
}