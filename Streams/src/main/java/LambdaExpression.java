@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // lambda Expression
        // It is an anonymous function ( no name, no return type, no access-modifier)
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });
        Thread t2 = t1;
        t2.run();

        MathOperation sumOperations = (a, b) -> a + b;
        //when only one line we can skip the return statement
        MathOperation subtractOperations = (a, b) -> a - b;

        int resSum = sumOperations.operate(5, 7);
        int resSub = subtractOperations.operate(8, 4);

        System.out.println(resSub);
        System.out.println(resSum);
    }
}
//class Task implements Runnable{
//
//    @Override
//    public void run() {
//        System.out.println("Hello");
//    }
//}

