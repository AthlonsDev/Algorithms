import java.util.Scanner;
class Factorial {

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate");

        int n = sc.nextInt();

        obj.FactorialNumber(n);


    }

    private void FactorialNumber(int n) {
        // n!(n-1)! in Recursive
        // If n is 1 factorial ends
        if (n == 1) {
            return;
        }
        // recursive to get n!
        FactorialNumber(n * n-1);
        
    }

}