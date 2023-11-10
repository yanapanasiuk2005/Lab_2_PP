package Task2;

public class Cube implements ShapeVolume {
    final private double cubeSide;

    public Cube(double ... args) {
        this.cubeSide = args[0];
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(this.cubeSide, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(this.cubeSide, 3);
    }

    @Override
    public void print() {
        System.out.println(Cube.this);
    }

    @Override
    public String toString() {
        return "Task2.Cube \n" +
                "\ncubeSide = " + cubeSide +
                "\narea is = " + calculateArea() +
                "\nvolume is = " + calculateVolume()+
                "\n";
    }
}
