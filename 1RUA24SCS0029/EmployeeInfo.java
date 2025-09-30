import java.util.Scanner;

public class EmployeeInfo {
    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id.trim();
            this.name = name.trim();
            this.department = department.trim();
            this.salary = salary;
        }

        void updateFromArgs(String[] args) {
            for (String arg : args) {
                if (arg.startsWith("department=")) {
                    this.department = arg.substring("department=".length()).trim();
                } else if (arg.startsWith("salary=")) {
                    try {
                        this.salary = Double.parseDouble(arg.substring("salary=".length()).trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid salary format in argument: " + arg);
                    }
                }
            }
        }

        @Override
        public String toString() {
            return String.format("ID: %s, Name: %s, Department: %s, Salary: %.2f",
                    id, name, department, salary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = 0.0;
        try {
            salary = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid salary input, defaulting to 0");
        }

        Employee emp = new Employee(id, name, department, salary);

        System.out.println("\nEmployee info before update:");
        System.out.println(emp);

        // Process command-line arguments for batch updates
        emp.updateFromArgs(args);

        System.out.println("\nEmployee info after update:");
        System.out.println(emp);

        sc.close();
    }
}
