// Creating Thread By Extending Thread Class
public class MyThread extends Thread {

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Kunal");
        }
    }
}
