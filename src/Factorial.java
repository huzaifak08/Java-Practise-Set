import java.util.Scanner;

public class Factorial {
    public static void factorialMethod() {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is: " + factorial);
    }

    public static void main(String[] args) {
        factorialMethod();
    }


}

