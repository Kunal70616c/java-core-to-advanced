import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
    public static void main(String[] args) {
        //UnaryOperator
        //BinaryOperator
        UnaryOperator<Integer> doubleIt = x -> x * 2;
        System.out.println(doubleIt.apply(10));

        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(2, 4));
    }
}
