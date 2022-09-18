
// 0    1   1   2   3   4
public class Factorial {

    public int factorial2(int n) {
        int p2p = 0;
        int p = 1;
        if (n == 0)
            return p2p;
        if (n == 1)
            return p;

        int current = p2p + p;
        n = n - 2;
        p = p2p;
        p2p = current;
        for (int i = 0; i <= n; i++) {
            current = p2p + p;
            p = p2p;
            p2p = current;
        }
        return current;
    }

    public int factorial(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return factorial(n - 1) + factorial(n - 2);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("The factorial of a number: " + factorial.factorial(10));
        System.out.println("The factorial of a number: " + factorial.factorial2(10));

    }
}
