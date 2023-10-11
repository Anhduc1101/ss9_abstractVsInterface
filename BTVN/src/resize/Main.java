package resize;

import java.util.Scanner;

public class Main {
           static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("***** Menu *****");
            System.out.println("1. Hình tròn");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình chữ nhật");
            System.out.println("4. Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            int choice= Integer.parseInt(scanner.nextLine());
            handleChoice(choice);

        }
    }

    private static void handleChoice(int choice) {
        switch (choice){
            case 1:
                handleCircle();
                break;
                case 2:
                    handleSquare();
                break;
                case 3:
                    handleRectngle();
                break;
                case 4:
                    System.exit(0);
                break;
            default:
                break;

        }
    }

    private static void handleRectngle() {
        Rectangle square = new Rectangle();
        System.out.println("Nhập vào chiều dài: ");
        double width=Double.parseDouble(scanner.nextLine());
        square.setWidth(width);
        System.out.println("Nhập vào chiều rộng: ");
        double height=Double.parseDouble(scanner.nextLine());
        square.setHeight(height);
        System.out.println("Nhập vào tỷ lệ %: ");
        double percent= Double.parseDouble(scanner.nextLine());
        square.resize(percent);
        System.out.println(square);
    }

    private static void handleSquare() {
        Square square = new Square();
        System.out.println("Nhập vào độ dài 1 cạnh bất kì: ");
        double side=Double.parseDouble(scanner.nextLine());
        square.setSide(side);
        System.out.println("Nhập vào tỷ lệ %: ");
        double percent= Double.parseDouble(scanner.nextLine());
        square.resize(percent);
        System.out.println(square);
    }

    private static void handleCircle() {
        Circle cirle = new Circle();
        System.out.println("Nhập vào bán kính: ");
        double r=Double.parseDouble(scanner.nextLine());
        cirle.setRadius(r);
        System.out.println("Nhập vào tỷ lệ %: ");
        double percent= Double.parseDouble(scanner.nextLine());
        cirle.resize(percent);
        System.out.println(cirle);
    }
}
