import java.util.Scanner;

public class PS_02_FibonacciSeries {
    public static void main(String[] args) {

        System.out.print("Enter any number: "); // 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i <= n; ++i) {
            System.out.print(first + ", "); // 0, 1, 1, 2, 3, 5,

            int next = first + second;

            first = second;
            second = next;
        }

    }
}
