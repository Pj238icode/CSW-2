import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    Rectangle() {

    }

    void set_length(double length) {
        this.length = length;

    }

    void set_width(double width) {
        this.width = width;
    }

    double get_length() {
        return length;
    }

    double get_width() {
        return width;
    }

    double area() {
        return (length * width);
    }

    double perimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("The length is " + length + " and the width is " + width + " and the area and perimeter is "
                + area() + " and " + perimeter() + " respectively");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        Rectangle obj = new Rectangle(length, width);
        obj.display();
        System.out.print("Enter the length1: ");
        int length1 = sc.nextInt();
        System.out.print("Enter the width1: ");
        int width1 = sc.nextInt();
        Rectangle obj1 = new Rectangle();
        obj1.set_length(length1);
        obj1.set_width(width1);
        obj1.display();

    }

}
