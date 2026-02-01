import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //Consumer doesn't return we can use this to consume something
        Consumer<Integer> print = (x)-> System.out.println(x);
        print.accept(69);
    }
}
