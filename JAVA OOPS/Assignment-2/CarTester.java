import java.util.Scanner;

class Car {
    private String Car;
    private String make;

    Car(String Car, String make) {
        this.Car = Car;
        this.make = make;

    }

    Car() {

    }

    void set_car(String Car) {
        this.Car = Car;

    }

    void set_make(String make) {
        this.make = make;
    }

    String get_car() {
        return Car;

    }

    String get_make() {
        return make;
    }

    void display() {
        System.out.println(Car + " " + make);
    }

}

public class CarTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car name: ");
        String name = sc.next();
        System.out.print("Enter manufacturer name: ");
        String make = sc.next();
        Car MyCar1 = new Car(name, make);
        MyCar1.display();
        System.out.print("Enter car2 name: ");
        String name2 = sc.next();
        System.out.print("Enter manufacturer2 name: ");
        String make2 = sc.next();
        Car MyCar2 = new Car();
        MyCar2.set_car(name2);
        MyCar2.set_make(make2);
        MyCar2.display();

    }

}