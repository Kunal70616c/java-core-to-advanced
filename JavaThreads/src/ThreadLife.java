public class ThreadLife extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLife t1 = new ThreadLife();
        System.out.println(t1.getState()); // New
        t1.start();
        System.out.println(t1.getState()); // Runnable
        Thread.sleep(200);
        System.out.println(t1.getState()); // Timed Waiting
        t1.join();
        System.out.println(t1.getState()); // Terminated
    }
}
