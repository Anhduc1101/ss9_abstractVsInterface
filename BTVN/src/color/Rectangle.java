package color;

import color.Shape;

public class Rectangle extends Shape  {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height=height;
        this.width=width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
