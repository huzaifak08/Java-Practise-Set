public class PS_16_TriangleHollow {
    public static void main(String[] args) {

        //    *
        //   * *
        //  *   *
        // *     *
        //*********

        for (int i = 1; i <= 5; i++) {

            // inner loop to print spaces.
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == 5 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
