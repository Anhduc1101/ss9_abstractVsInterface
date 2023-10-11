package color;

public class Square extends Shape implements IColorable {
    private double a;

    public Square(float a) {
        this.a = a;
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getArea() {
        return getA() * getA();
    }

}
