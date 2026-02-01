import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // predicate is a functional interface, it is a boolean-valued function
        //It Only Holds a Condition
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        // Example With String <<< String Validation Example >>>

        Predicate<String> isStartsWithK = x -> x.toLowerCase().startsWith("k");
        Predicate<String> isEndsWithL = x -> x.toLowerCase().endsWith("l");
        System.out.println(isStartsWithK.test("Kunal")); //true
        System.out.println(isStartsWithK.test("Random")); //false
        // We Can Combine The Predicates
        Predicate<String> doubleCondition = isStartsWithK.and(isEndsWithL);
        System.out.println(doubleCondition.test("Kunal"));// true
        System.out.println(doubleCondition.test("raiko"));// false

    }
}
