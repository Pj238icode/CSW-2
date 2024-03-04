

import java.util.Scanner;

interface Vehicle {
 void accelerate();
 void brake();
}

class Car implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Car is accelerating.");
 }

 @Override
 public void brake() {
     System.out.println("Car is braking.");
 }

 public void accelerate(int speed) {
     System.out.println("Car is accelerating at speed: " + speed + " km/h.");
 }

 public void accelerate(int speed, int duration) {
     System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds.");
 }
}


class Bicycle implements Vehicle {
 @Override
 public void accelerate() {
     System.out.println("Bicycle is pedaling faster.");
 }

 @Override
 public void brake() {
     System.out.println("Bicycle is applying brakes.");
 }

 public void accelerate(int RPM) {
     System.out.println("Bicycle is accelerating with " + RPM + " RPM.");
 }
}


public class Main2 {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the rpm of the car: ");
	 int rpm=sc.nextInt();
	 System.out.print("Enter the duration: ");
	 int duration=sc.nextInt();
	 System.out.print("Enter the rpm of bicycle: ");
	 int rpm1=sc.nextInt();
    
     Car obj1 = new Car();
     Bicycle obj2 = new Bicycle();

    
     obj1.accelerate();
     obj1.brake();

     obj2.accelerate();
     obj2.brake();
     obj1.accelerate(rpm);
     obj1.accelerate(rpm, duration);
     obj2.accelerate(rpm1);
 }
}

