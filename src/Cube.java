
import java.io.IOException;
import java.util.Scanner;

public class Cube extends Shape {
    protected double edge;

    @Override
    public double calculateV() {
        return Math.pow(edge, 3);
    }

    @Override
    public double calculateS() {
        return Math.pow(edge, 2) * 6;
    }

    @Override
    public void outputResult() {
        System.out.println("Объем куба: " + calculateV() + "см"+(char)179  + ".");
        System.out.println("Площадь поверхности куба: " + calculateS() + "см"+(char)178  + ".");
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
        System.out.println("Введите длину стороны куба в сантиметрах.");
        Scanner scanner = new Scanner(System.in);
        this.edge = scanner.nextDouble();
    }
}
