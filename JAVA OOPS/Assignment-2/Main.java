import java.util.Scanner;

class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [Model: " + model + ", Price: $" + price + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the laptop model: ");
        String model = sc.nextLine();
        System.out.print("Enter the laptop price: ");
        Double price = sc.nextDouble();

        Laptop myLaptop = new Laptop();

        myLaptop.setModel(model);

        myLaptop.setPrice(price);

        System.out.println(myLaptop.toString());
    }
}
