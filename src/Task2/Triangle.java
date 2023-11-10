package Task2;

public class Triangle implements ShapeArea {
    final private double sideA;
    final private double sideB;
    final private double sideC;


    public Triangle(double ... args) {
        this.sideA = args[0];
        this.sideB = args[1];
        this.sideC = args[2];
    }

    public double findPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
    @Override
    public double calculateArea() {
        return Math.sqrt(findPerimeter()
                * (findPerimeter() - this.sideA)
                * (findPerimeter() - this.sideB)
                * (findPerimeter() - this.sideC));
    }

    @Override
    public void print() {
        System.out.println(Triangle.this);
    }

    @Override
    public String toString() {
        return "Task2.Triangle \n" +
                "\nsideA = " + sideA +
                "\nsideB = " + sideB +
                "\nsideC = " + sideC +
                "\narea is = " + calculateArea()+
                "\n";
    }
}
