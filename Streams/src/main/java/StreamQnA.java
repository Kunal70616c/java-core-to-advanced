import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQnA {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 45, 56, 7, 89, 91, 213, 44, 56);
        List<String> names = Arrays.asList("Kunal", "Messi", "Neymar", "Kante", "Yamal", "Rafiniaa", "Ronaldo");

        //Example 1
        // Find out names with length more than 3
        System.out.println(names.stream().filter(x->x.length()>3).collect(Collectors.toList()));

        // Example 2
        // Return Squared And Sorted List
        System.out.println(listOfIntegers.stream().map(x->x*x).collect(Collectors.toList()));

        // Example 3
        // Return The sum of Integers
        System.out.println(listOfIntegers.stream().reduce(Integer::sum).get());

        //Example 4
        // find out occurrence of a characters
        String sentence = "I am Kunal Pal";
        System.out.println(sentence.toLowerCase().chars().filter(x-> x == 'l').count());


    }
}
