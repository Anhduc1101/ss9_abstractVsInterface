package resize;

public class Square extends Shape implements IResizeable {
    private double side;

    public Square() {
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
