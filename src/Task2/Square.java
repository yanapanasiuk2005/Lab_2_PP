package Task2;

public class Square  implements ShapeArea {
    final private double squareSide;

    public Square(double ... args) {
        this.squareSide = args[0];
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.squareSide, 2);
    }

    @Override
    public void print() {
        System.out.println(Square.this);
    }

    @Override
    public String toString() {
        return "Task2.Square \n" +
                "\nsquareSide = " + squareSide +
                "\narea is = " + calculateArea()+
                "\n";
    }
}

