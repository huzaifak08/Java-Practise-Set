public class PS_13_ReverseRightTriangle {
    public static void main(String[] args) {
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (5 - i) + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
