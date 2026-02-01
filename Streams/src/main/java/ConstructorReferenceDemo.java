import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        //Constructor Reference
        List<String> list = List.of("Apple", "Banana", "Cherry");
        list.forEach(System.out::println);
        List<String> brandNames = Arrays.asList("Samsung", "Apple", "OneMinus"); // Lambda
        List<Mobile> mobiles = brandNames.stream().map(Mobile::new).collect(Collectors.toList());
        // Constructor Reference
        mobiles.forEach(System.out::println);

    }

    static class Mobile {
        String name;

        public Mobile(String name) {
            this.name = name;
        }

    }
}

