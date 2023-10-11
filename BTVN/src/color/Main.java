package color;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(4, 7);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area"+shapes[i].getArea());
            if(shapes[i] instanceof IColorable){
                ((IColorable) shapes[i]).howToColor();
            }
        }
    }
}
