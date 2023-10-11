package abstractClassWithShape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("đỏ", 5);
        circle.display();
//        System.out.println("có diện tích là: " + circle.getArea());
        Shape rectangle = new Rectangle("xanh", 7, 8);
        rectangle.display();
//        System.out.println("có diện tích là: "+rectangle.getArea());
    }
}
