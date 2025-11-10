import java.util.ArrayList;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Box contains: " + value);
    }
}

public class Labprog8 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);   
        Box<String> strBox = new Box<>("Hello Generics");
        Box<Double> doubleBox = new Box<>(45.67);

        intBox.display();
        strBox.display();
        doubleBox.display();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // Autoboxing: int → Integer
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nArrayList Elements (Autoboxed):");
        for (Integer n : numbers) {
            System.out.println(n);
        }
    }
}
