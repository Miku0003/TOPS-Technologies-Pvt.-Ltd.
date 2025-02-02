package CoreJava;


//Synchronized Block

class Counters {
 private int count = 0;
 private final Object lock = new Object();

 public void increment() {
     synchronized (lock) {
         count++;
     }
 }

 public int getCount() {
     synchronized (lock) {
         return count;
     }
 }
}

class CounterThreads extends Thread {
 private Counter counter;

 public CounterThreads(Counter counter) {
     this.counter = counter;
 }

 @Override
 public void run() {
     for (int i = 0; i < 26700; i++) {
         counter.increment();
     }
 }
}

public class P035_SynchronizedBlock {
 public static void main(String[] args) throws InterruptedException {
     Counter counter = new Counter();
     CounterThreads thread1 = new CounterThreads(counter);
     CounterThreads thread2 = new CounterThreads(counter);

     thread1.start();
     thread2.start();

     thread1.join();
     thread2.join();

     System.out.println("Final count: " + counter.getCount());
 }
}
