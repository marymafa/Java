public class Factorial {
    public int factorial(int n) {
        // Happy coding :-)
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        final int factorial = Factorial.factorial();
        System.out.println(factorial);
    }

    private static int factorial() {
        return 0;
    }

    ;
}
