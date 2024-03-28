import java.util.Scanner;

public class PS_10_MirroredRhombus {
    static void mirroredRhombus(int n) {
        for (int i = 0; i < n; i++) {

            // For Spaces:
            for (int j = n - i; j < n; j++) {
                System.out.print(" ");
            }

            // For Stars:
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        //   ******
        //   -******
        //   --******
        //   ---******
        //   ----******
        //   -----******

        System.out.print("Enter the number or rows: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        mirroredRhombus(num);
    }
}
