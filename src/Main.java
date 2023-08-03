//import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int numberOfMenu = 0;


        while (numberOfMenu != 5) {
            System.out.println("1. Расчитать объем и площадь поверхности куба. Введите 1");
            System.out.println("2. Расчитать объем и площадь поверхности сферы. Введите 2");
            System.out.println("3. Расчитать объем и площадь поверхности цилиндра. Введите 3");
            System.out.println("4. Расчитать объем и площадь поверхности параллелипипеда. Введите 4");
            System.out.println("5. Для выхода из приложения - введите 5");

            try {
                Scanner scan = new Scanner(System.in);
                numberOfMenu = scan.nextInt();

                if(numberOfMenu < 1 || numberOfMenu > 5)
                    throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный ввод. Введите номер задачи от 1 до 5.");
                System.out.println();
            } catch (InputMismatchException er) {
                System.out.println("Недопустимый ввод. Введите номер задачи от 1 до 5.");
                System.out.println();
            }
            switch (numberOfMenu) {
                case 1:
                    //куб
                    try {
                        Shape shape  = new Cube();
                        shape.allAction();
                    } catch (InputMismatchException er) {
                        System.out.println("Недопустимый ввод. Необходимо вводить число.");
                        System.out.println();
                    }

                    break;
                case 2:
                    //сфера
                    try {
                        Shape shape = new Sphere();
                        shape.allAction();

                    } catch (InputMismatchException er) {
                        System.out.println("Недопустимый ввод. Необходимо вводить число.");
                        System.out.println();
                    }

                    break;
                case 3:
                    //цилиндр
                    try {
                        Shape shape = new Cylindr();
                        shape.allAction();

                    } catch (InputMismatchException er) {
                        System.out.println("Недопустимый ввод. Необходимо вводить число.");
                        System.out.println();
                    }
                    break;
                case 4:
                    //,параллелипипед
                    try {
                        Shape shape = new Parallelipiped();
                        shape.allAction();
                    } catch (InputMismatchException er) {
                        System.out.println("Недопустимый ввод. Необходимо вводить число.");
                        System.out.println();
                    }

                    break;
            }


        }

    }
}