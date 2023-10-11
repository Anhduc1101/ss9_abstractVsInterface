package abstractClassWithShape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    void display() {
        System.out.println("Hình tròn màu "+getColor()+" ,có diện tích là: "+getArea());
//        return false;
    }

}
