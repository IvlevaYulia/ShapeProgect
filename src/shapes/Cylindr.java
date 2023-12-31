package shapes;

import java.io.IOException;
import java.util.Scanner;

public class Cylindr extends Shape {
    protected double height;
    protected double radius;
    private Scanner scan;

    @Override
    public double calculateV() {
        return Math.pow(radius, 2) * Math.PI * height;
    }

    @Override
    public double calculateS() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public void outputResult() {
        System.out.println("Объем цилиндра: " + calculateV()  + "см"+(char)179  + ".");
        System.out.println("Площадь поверхности цилиндра: " + calculateS() + "см"+(char)178  + ".");
        System.out.println();
        System.out.println("Для продолжения нажмите любую кнопку...");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void inputData(){
        System.out.println("Введите радиус цилиндра в сантиметрах.");
        Scanner scan = new Scanner(System.in);
        this.radius = scan.nextDouble();
        System.out.println("Введите высоту цилиндра в сантиметрах.");
        //Scanner scan1 = new Scanner(System.in);
        this.height = scan.nextDouble();

    }
}
