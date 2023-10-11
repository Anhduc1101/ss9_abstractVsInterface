package resize;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (1 + percent / 100);
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "radius=" + radius +
//                '}';
//    }
}
