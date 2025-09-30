class Car {
String brand = "Generic Car";
void displayInfo() {
System.out.println("Car brand: " + brand);
}
}
class ElectricCar extends Car {
String brand = "Tesla"; // hides superclass field
void displayInfo() {
System.out.println("Car brand: " + brand); // subclass brand
System.out.println("Car brand: " + super.brand); // superclass brand
super.displayInfo(); // calls Car's displayInfo()
}
}
public class SuperMemberExample {
public static void main(String[] args) {
ElectricCar ec = new ElectricCar();
ec.displayInfo();
}
}