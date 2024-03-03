import java.util.Scanner;

public class PS_03_PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Enter any number to check: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            } else {
                System.out.println("Prime Number");
            }
        }
    }
}
