package shapes;

import java.util.InputMismatchException;

abstract public class Shape implements Calculated, InOut {
    //public double squareOfSurf;
    //public double volumeOfSurf;
    public void allAction(){
        try{
            inputData();
            outputResult();
        } catch (InputMismatchException er) {
            System.out.println("Недопустимый ввод. Необходимо вводить число.");
            System.out.println();
        }

    }
}
