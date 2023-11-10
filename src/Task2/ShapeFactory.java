package Task2;

public class ShapeFactory {
    public ShapeFactory() {
    }

    public void createShape(String shapeType, double... args) {
        switch (shapeType) {
            case "triangle":
                Triangle triangle = new Triangle(args);
                System.out.println("Creating a triangle with arguments: " + triangle);
                break;
            case "square":
                Square square = new Square(args);
                System.out.println("Creating a square with arguments: " + square);
                break;
            case "rectangle":
                Rectangle rectangle = new Rectangle(args);
                System.out.println("Creating a rectangle with arguments: " + rectangle);
                break;
            case "cube" :
                Cube cube = new Cube(args);
                System.out.println("Creating a cube with arguments: " + cube);
                break;
            case "pyramid" :
                Pyramid pyramid = new Pyramid(args);
                System.out.println("Creating a pyramid with arguments: " + pyramid);
                break;
            case "circle":
                Circle circle = new Circle(args);
                System.out.println("Creating a circle with arguments: " + circle);
                break;
            case "sphere":
                Sphere sphere = new Sphere(args);
                System.out.println("Creating a sphere with arguments: " + sphere);
                break;
            default:
                System.out.println("Wrong shape!");
        }
    }
}
