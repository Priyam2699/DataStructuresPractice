import java.util.Scanner;

public class FactorialUsingRecursion {

    public static int iterativeFactorial(int x) {
        if (x == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursionFactorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * recursionFactorial(x - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial using Iteration and Recursion");
        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("Factorial using iterative method is " + iterativeFactorial(num));
        System.out.println("Factorial using recursive method is " + recursionFactorial(num));

    }
}
