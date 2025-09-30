class Employee {
String name;
double salary;
// Superclass constructor
Employee(String name, double salary) {
this.name = name;
this.salary = salary;
System.out.println("Employee Constructor Called");
}
}
class Manager extends Employee {
String department;
// Subclass constructor calls superclass constructor using super()
Manager(String name, double salary, String department) {
super(name, salary); // calls Employee(String, double)
this.department = department;
System.out.println("Manager Constructor Called");
}
void display() {
System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " +
department);
}
}
public class SuperConstructorExample {
public static void main(String[] args) {
Employee e = new Employee("sk", 80000);
Manager m = new Manager("John", 80000, "IT");
m.display();
}
}