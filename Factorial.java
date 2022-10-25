import java.util.Scanner;
class Factorial {

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate");

        int n = sc.nextInt();

        System.out.println("Factorial of "+ n + " is " + obj.FactorialNumber(n));

    }

    private int FactorialNumber(int n) {
        // if or when n is equal 1 the code will stop and returns 1
        if(n==1) {
            return 1;
        }
        // recursive call of the same function decreasing the variable by 1 and muplying it by the variable until it reaches 1
        return n * FactorialNumber(n-1);
        
    }

}