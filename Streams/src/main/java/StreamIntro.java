import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntro {
    public static void main(String[] args) {
        // Streams was introduced in Java 8
        // It is used to process collections of objects
        // Used for simplify data processing
        // Embraces functional programming
        // Enables parallel processing without multithreading

        // How to use Stream ?
        // A Sequence of elements that supports various operations

        // Source -> Operation -> Terminal
        // Source : Where the data is coming from
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Operation : What to do with the data
        //Old Way
        int count=0;
        for(int i :numbers){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
        //New Way
        System.out.println(numbers.stream().filter(x->x%2==0).count());//Easy to read
        // Terminal : Where the data is going to

        //Create Streams
        //1. Collection
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        //2. Array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream.of(array);
        //3. Using Stream.of()
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //4. Infinite Stream
        Stream<Integer> infinteStream = Stream.generate(()->1);
        //5. Infinite Stream with limit
        List<Integer> collect = Stream.iterate(1, x->x+1).limit(50).collect(Collectors.toList());

    }
}
