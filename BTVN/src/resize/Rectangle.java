package resize;

public class Rectangle extends Shape implements IResizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.height = this.height * (1 + percent / 100);
        this.width = this.width * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
