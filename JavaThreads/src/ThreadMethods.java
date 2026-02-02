public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("=== Thread Methods Demonstration ===\n");
        
        // Demonstrate start() and basic thread creation
        demonstrateStart();
        
        // Demonstrate sleep()
        demonstrateSleep();
        
        // Demonstrate join()
        demonstrateJoin();
        
        // Demonstrate setPriority()
        demonstratePriority();
        
        // Demonstrate interrupt()
        demonstrateInterrupt();
        
        // Demonstrate yield()
        demonstrateYield();
        
        // Demonstrate daemon thread
        demonstrateDaemonThread();
    }
    
    static void demonstrateStart() {
        System.out.println("1. Demonstrating start() method:");
        Thread thread1 = new Thread(() -> {
            System.out.println("   Thread 1 is running after start()");
        });
        
        System.out.println("   Creating thread and calling start()...");
        thread1.start();
        
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Thread completed\n");
    }
    
    static void demonstrateSleep() {
        System.out.println("2. Demonstrating sleep() method:");
        Thread sleepingThread = new Thread(() -> {
            try {
                System.out.println("   Thread going to sleep for 2 seconds...");
                Thread.sleep(2000);
                System.out.println("   Thread woke up from sleep");
            } catch (InterruptedException e) {
                System.out.println("   Sleep was interrupted");
            }
        });
        
        sleepingThread.start();
        try {
            sleepingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Sleep demonstration completed\n");
    }
    
    static void demonstrateJoin() {
        System.out.println("3. Demonstrating join() method:");
        Thread workerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("   Worker thread working... " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        Thread mainThread = Thread.currentThread();
        
        System.out.println("   Starting worker thread...");
        workerThread.start();
        
        try {
            System.out.println("   Main thread waiting for worker to complete...");
            workerThread.join();
            System.out.println("   Worker thread completed, main thread continuing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Join demonstration completed\n");
    }
    
    static void demonstratePriority() {
        System.out.println("4. Demonstrating setPriority() method:");
        
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("   High priority thread: " + i);
                Thread.yield();
            }
        });
        
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("   Low priority thread: " + i);
                Thread.yield();
            }
        });
        
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("   High priority thread priority: " + highPriorityThread.getPriority());
        System.out.println("   Low priority thread priority: " + lowPriorityThread.getPriority());
        
        highPriorityThread.start();
        lowPriorityThread.start();
        
        try {
            highPriorityThread.join();
            lowPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Priority demonstration completed\n");
    }
    
    static void demonstrateInterrupt() {
        System.out.println("5. Demonstrating interrupt() method:");
        
        Thread longRunningThread = new Thread(() -> {
            try {
                System.out.println("   Long running thread started...");
                for (int i = 1; i <= 10; i++) {
                    System.out.println("   Working... " + i);
                    Thread.sleep(1000);
                    
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("   Thread was interrupted, cleaning up...");
                        return;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("   Thread caught InterruptedException, exiting gracefully");
            }
        });
        
        longRunningThread.start();
        
        try {
            Thread.sleep(3000);
            System.out.println("   Main thread interrupting long running thread...");
            longRunningThread.interrupt();
            longRunningThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Interrupt demonstration completed\n");
    }
    
    static void demonstrateYield() {
        System.out.println("6. Demonstrating yield() method:");
        
        Thread yieldingThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("   Yielding thread: " + i);
                if (i % 2 == 0) {
                    System.out.println("   Yielding processor time...");
                    Thread.yield();
                }
            }
        });
        
        Thread regularThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("   Regular thread: " + i);
            }
        });
        
        yieldingThread.start();
        regularThread.start();
        
        try {
            yieldingThread.join();
            regularThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Yield demonstration completed\n");
    }
    
    static void demonstrateDaemonThread() {
        System.out.println("7. Demonstrating daemon thread:");
        
        Thread daemonThread = new Thread(() -> {
            int count = 0;
            while (true) {
                System.out.println("   Daemon thread running... " + (++count));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        
        daemonThread.setDaemon(true);
        System.out.println("   Daemon thread daemon status: " + daemonThread.isDaemon());
        
        daemonThread.start();
        
        try {
            System.out.println("   Main thread sleeping for 3 seconds...");
            Thread.sleep(3000);
            System.out.println("   Main thread finishing, daemon thread will terminate automatically");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("   Daemon thread demonstration completed\n");
        System.out.println("=== All Thread Methods Demonstrations Complete ===");
    }
}
