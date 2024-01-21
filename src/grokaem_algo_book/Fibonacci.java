package grokaem_algo_book;

/**
 * For RECURSION example.
 * RECURSION works as STACK
 */

public class Fibonacci {

    public int findFibonacci(int num, String side) {

        System.out.print("side " + side + " num = " + num + ", ");

        if (num <= 1) {
            return num;
        }

        int sum = findFibonacci(num - 1, "left") + findFibonacci(num - 2, "right");

        System.out.println("sum = " + sum);

        return sum;

    }

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        System.out.println(f.findFibonacci(5, "init"));

    }

}
