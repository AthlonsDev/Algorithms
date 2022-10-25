public class Fibonacci {
    

    public static void main(String[] args) {
        
        Fibonacci fib = new Fibonacci();

        System.out.print(fib.FibSequence(3));
    }

    private int FibSequence(int n) {

        if (n==1 || n==2) {
            return 1;
        }
        if (n<30) {
            return FibSequence(n-1) + FibSequence(n-2);
        }
        return 30;
    }
}
