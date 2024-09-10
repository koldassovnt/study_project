package multithreading.join;

public class ThreadJoinExample extends Thread {

    @Override
    public void run() {
        System.out.println("1. Hello from thread");
    }

    static class ThreadJoinExample2 extends Thread {
        @Override
        public void run() {
            System.out.println("2. Hello from thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadJoinExample();
        Thread thread2 = new ThreadJoinExample2();
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println("3. Hello from thread");
    }

}
