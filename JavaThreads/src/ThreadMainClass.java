public class ThreadMainClass {
    public static void main(String[] args) {
        // Creating Thread Object
        MyThread thread_1 = new MyThread();
        // Creating Thread From Runnable
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread thread_2 = new Thread(myRunnableThread); // New
        thread_2.start(); // Runnable
        try {
            thread_1.run();
            thread_1.sleep(100000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
