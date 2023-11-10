package Task2;

public class Sphere implements ShapeVolume {
    final private double sphereRadius;

    public Sphere(double ... args) {
        this.sphereRadius = args[0];
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(this.sphereRadius, 2);
    }

    @Override
    public double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(this.sphereRadius, 3);
    }

    @Override
    public void print() {
        System.out.println(Sphere.this);
    }

    @Override
    public String toString() {
        return "Task2.Sphere \n" +
                "\nsphereRadius = " + sphereRadius +
                "\narea is = " + calculateArea() +
                "\nvolume is = " + calculateVolume()+
                "\n";
    }
}

