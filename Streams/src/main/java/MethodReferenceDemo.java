import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //Method Reference
        List<String> list = List.of("Apple", "Banana", "Cherry");
        list.forEach(x-> System.out.println(x)); // Lambda
        list.forEach(System.out::println); // Method Reference
    }
}
