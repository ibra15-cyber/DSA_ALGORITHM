package Fibonacci;

public class FibonacciClass {

//    public int fibonacci(int n) {
//        if(n <= 1) return n;
//        else return fibonacci(n - 2) + fibonacci(n-1);
//
//    }
    public static int fibonacci(int n) {
        if(n <= 1)
           return n;
        else return fibonacci(n - 2) + fibonacci(n-1);

    }

    public static void main(String[] args) {
        int n = 20;
//        FibonacciClass obj = new FibonacciClass();
//        int fib = obj.fibonacci(n);

        int fib = fibonacci(n);
        System.out.println("The fib of " +n+ " is " + fib);
    }
}
