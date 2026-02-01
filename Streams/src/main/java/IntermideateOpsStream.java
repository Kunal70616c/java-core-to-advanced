import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntermideateOpsStream {
    public static void main(String[] args) {
        //Intermediate Operations
        // It converts stream to another stream
        // Lazy in nature means it doesn't execute until terminal operation is called
        //List
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 45, 56, 7, 89, 91, 213, 44, 56);

        //Filter
        System.out.println("====Filter====");
        List<String> names = Arrays.asList("Kunal", "Messi", "Neymar", "Kante", "Yamal", "Rafiniaa", "Ronaldo");
        names.stream().filter(x -> x.toLowerCase()
                .startsWith("k")).forEach(System.out::println);

        //Map
        System.out.println("====Map====");
        names.stream().map(String::toUpperCase).forEach(System.out::println); //KUNAL MESSI NEYMAR
        //sorted
        System.out.println("====Sorted Asc====");
        names.stream().sorted().forEach(System.out::println);
        System.out.println("====Sorted by length====");
        names.stream().sorted((x, y) -> x.length() - y.length()).forEach(System.out::println);
        //distinct
        System.out.println("====Distinct====");
        names.stream().distinct().forEach(System.out::println);
        //limit
        System.out.println("====Limit====");
        names.stream().limit(2).forEach(System.out::println);
        //skip
        System.out.println("====Skip====");
        names.stream().skip(2).forEach(System.out::println);
        // peek
        System.out.println("====Peek====");
        names.stream().peek(x -> System.out.println(x)).forEach(System.out::println);
        // Collect
        System.out.println("====Collect====");
        List<String> collect = names.stream().collect(Collectors.toList());
        // collector
        System.out.println("====Collector====");
        names.stream().collect(Collectors.toSet()).forEach(System.out::println);
        names.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        //forEach
        System.out.println("====forEach====");
        names.stream().forEach(System.out::println);
        //Reduce
        System.out.println("====Reduce====");
        Optional<Integer> optionalNumber = listOfIntegers.stream().reduce((x, y) -> x + y);
        System.out.println(optionalNumber.get());

        // anyMatch, allMatch, noneMatch
        System.out.println("==== anyMatch allMatch noneMatch====");
        boolean anyMatch = listOfIntegers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch); // returns true if one condition matches
        boolean allMatch = listOfIntegers.stream().allMatch(x -> x > 0);
        System.out.println(allMatch); // returns true if all conditions matches
        boolean noneMatch = listOfIntegers.stream().noneMatch(x -> x < 0);
        System.out.println(noneMatch); // returns true if none of the conditions matches

        //findFirst, findAny
        System.out.println("====findFirst findAny====");
        System.out.println(listOfIntegers.stream().findFirst().get());
        System.out.println(listOfIntegers.stream().findAny().get());


    }
}
