package Fibonacci;

public class FibLoop {

    public static void main(String[] args) {
        int prev2 = 0;
        int prev1 = 1;
        System.out.print(prev2 + " ");
        System.out.print(prev1 + " ");

        for (int i = 0; i < 10; i++) {
            int newFib = prev2 + prev1;
            System.out.print(newFib + " ");
            prev2 = prev1;
            prev1 = newFib;
        }
    }
}
