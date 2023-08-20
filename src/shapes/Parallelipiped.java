package shapes;

import java.io.IOException;
import java.util.Scanner;

public class Parallelipiped extends Shape {
    protected double height;
    protected double length;
    protected double width;
    private Scanner scan;

    @Override
    public double calculateV() {
        return height * length * width;
    }

    @Override
    public double calculateS() {
        return (height * length + length * width + height * width) * 2;
    }

    @Override
    public void outputResult() {
        if ((this.length < 0) || (this.height < 0) || (this.width < 0)) {
            System.out.println("");
            return;
        }
        System.out.println("Объем параллелипипеда: " + calculateV()  + "см"+(char)179 + ".");
        System.out.println("Площадь поверхности параллелипипеда: " + calculateS() + "см"+(char)178  + ".");
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
        System.out.println("Введите длину параллелипипеда в сантиметрах.");
        Scanner scan = new Scanner(System.in);
        this.length = scan.nextDouble();
        if (this.length < 0) {
            System.out.println("Отрицательные числа вводить нельзя");
            return;
        }
        System.out.println("Введите ширину параллелипипеда в сантиметрах.");
        //Scanner scan1 = new Scanner(System.in);
        this.width = scan.nextDouble();
        if (this.width < 0) {
            System.out.println("Отрицательные числа вводить нельзя");
            return;
        }
        System.out.println("Введите высоту параллелипипеда.");
        //Scanner scan2 = new Scanner(System.in);
        this.height = scan.nextDouble();
        if (this.height < 0) {
            System.out.println("Отрицательные числа вводить нельзя");

        }


    }
}
