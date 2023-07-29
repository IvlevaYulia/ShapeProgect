import java.util.Scanner;

public class Sphere extends Shape {
    protected double radius;

    @Override
    public double calculateV() {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateS() {
        return Math.PI * Math.pow(radius, 2) * 4;
    }

    @Override
    public void outputResult() {
        System.out.println("Объем сферы: " + calculateV()  + "см"+(char)179  + ".");
        System.out.println("Площадь поверхности сферы: " + calculateS() + "см"+(char)178  + ".");
        System.out.println();

    }

    @Override
    public void inputData() {
        System.out.println("Введите радиус сферы  в сантиметрах.");
        Scanner scanner = new Scanner(System.in);
        this.radius = scanner.nextDouble();

    }
}
