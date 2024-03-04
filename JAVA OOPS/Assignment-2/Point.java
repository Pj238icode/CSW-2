import java.util.Scanner;

public class Point {
    int X;
    int Y;

    Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    Point() {

    }

    Point(Point obj) {
        this.X = obj.X;
        this.Y = obj.Y;
    }

    void set_X(int X) {
        this.X = X;
    }

    void set_Y(int Y) {
        this.Y = Y;
    }

    int get_X() {
        return X;
    }

    int get_Y() {
        return Y;
    }

    void display() {
        System.out.println("The value of X is " + X + " and the value of Y is " + Y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int X = sc.nextInt();
        System.out.print("Enter Y: ");
        int Y = sc.nextInt();
        Point obj = new Point(X, Y);
        obj.display();
        Point obj2 = new Point();
        System.out.print("Enter X1: ");
        int X1 = sc.nextInt();
        System.out.print("Enter Y1: ");
        int Y1 = sc.nextInt();
        obj2.set_X(X1);
        obj2.set_Y(Y1);
        Point obj3 = new Point(obj2);
        obj3.display();

    }

}