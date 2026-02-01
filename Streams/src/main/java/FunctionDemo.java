import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Function does some work for us.
        // It also a functional interface.
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        System.out.println(doubleIt.apply(10)); //20
        System.out.println(tripleIt.apply(10)); //30
        System.out.println(doubleIt.andThen(tripleIt).apply(10)); //60

        //Identity
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5); // returns 5
        System.out.println(res);//5
        //Useful in Streams We Will See

    }
}
