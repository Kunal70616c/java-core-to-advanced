import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiClassDemo {
    public static void main(String[] args) {
        // BiConsumer , BiFunction , BiPredicate
        BiConsumer<String, String> concat = (x, y) -> System.out.println(x + y);
        concat.accept("Hello", "World");

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(2, 4));

        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(2, 4));


    }
}
