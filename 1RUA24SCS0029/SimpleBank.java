import java.util.Scanner; 

class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double... transactions) {
        this.name = name;
        for (double t : transactions) {
            balance += t;
        }
    }

    void showAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
    }
}

public class SimpleBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // No more error

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter two transactions (deposit/withdrawal): ");
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();

        BankAccount acc = new BankAccount(name, t1, t2);
        acc.showAccount();
    }
}

