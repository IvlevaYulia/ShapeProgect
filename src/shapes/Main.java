package shapes;//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//import org.jetbrains.annotations.NotNull;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int numberOfMenu = 0;
        Shape shape = null;


        while (numberOfMenu != 5) {
            System.out.println("1. Расчитать объем и площадь поверхности куба. Введите 1");
            System.out.println("2. Расчитать объем и площадь поверхности сферы. Введите 2");
            System.out.println("3. Расчитать объем и площадь поверхности цилиндра. Введите 3");
            System.out.println("4. Расчитать объем и площадь поверхности параллелипипеда. Введите 4");
            System.out.println("5. Для выхода из приложения - введите 5");


            try {
                Scanner scan = new Scanner(System.in);
                numberOfMenu = scan.nextInt();


                if (numberOfMenu < 1 || numberOfMenu > 5)
                    throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный ввод. Введите номер задачи от 1 до 5.");
                System.out.println();
                continue;
            } catch (InputMismatchException er) {
                System.out.println("Недопустимый ввод. Введите номер задачи от 1 до 5.");
                System.out.println();
                continue;
            }

            switch (numberOfMenu) {
                case 1: //куб
                    shape = new Cube();
                    //shape.allAction();
                    break;
                case 2: //сфера
                    shape = new Sphere();
                    //shape.allAction();
                    break;
                case 3: //цилиндр
                    shape = new Cylindr();
                    //shape.allAction();
                    break;
                case 4: //параллелипипед
                    shape = new Parallelipiped();
                    //shape.allAction();
                    break;
                case 5:
                    return;
            }
            if (shape != null) {
                shape.allAction();
            }
        }
    }

}