package CoreJava;


// Shared Resource Class: Counter

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        notify(); // Notify waiting threads
    }

    public synchronized void decrement() {
        while (count == 0) {
            try {
                wait(); // Wait for increment thread to notify
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}


// Increment Thread Class: IncrementThread

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            System.out.println("Incremented: " + counter.getCount());
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


// Decrement Thread Class: DecrementThread

class DecrementThread extends Thread {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.decrement();
            System.out.println("Decremented: " + counter.getCount());
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


// Main Class

public class P036_UseInterThreadCommunicationMethodsLikeWaitNotifyNotifyall {
    public static void main(String[] args) {
        Counter counter = new Counter();

        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();
    }
}

