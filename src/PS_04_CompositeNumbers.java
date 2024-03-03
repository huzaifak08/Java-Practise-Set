import java.util.Scanner;

public class PS_04_CompositeNumbers {
    public static void main(String[] args) {
        System.out.print("Enter any number to check: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                count++;
            }

            if (count > 2) {
                System.out.println("Composite Number");
            } else {
                System.out.println("Not Composite Number");
            }
        }

    }
}
