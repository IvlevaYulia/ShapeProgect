public class Cylindr extends Shape {
    protected double hight;
    protected double radius;

    @Override
    public double calculateV() {
        return Math.PI * radius * radius * hight;
    }

    public Cylindr(){
        inputData();
    }

    @Override
    public double calculateS() {
        return 2 * Math.PI * radius * (radius + hight);
    }

    @Override
    public void printData() {
        System.out.println("");

    }

    @Override
    public void inputData() {
        System.

    }
}
