public class PS_06_Triangle {
    static void triangleStar(int n) {
        // Number of Rows:
        for (int i = 0; i < n; i++) {

            // For Printing Spaces:
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            // For Printing Stars:
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *

        triangleStar(5);
    }
}
