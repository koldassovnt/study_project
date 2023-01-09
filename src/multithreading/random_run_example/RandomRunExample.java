package multithreading.random_run_example;

public class RandomRunExample extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void example() {
        for (int i = 0; i < 10; i++) {
            RandomRunExample randomRunExample = new RandomRunExample();
            randomRunExample.start();
        }
    }
}
