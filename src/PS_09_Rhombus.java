public class PS_09_Rhombus {

    static void rhombusPattern(int n) {
        // For number of rows:
        for (int i = 1; i <= n; i++) {

            // For printing of spaces:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // For printing of stars:
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        //   -----******
        //   ----******
        //   ---******
        //   --******
        //   -******
        //   ******

        rhombusPattern(5);

    }
}
