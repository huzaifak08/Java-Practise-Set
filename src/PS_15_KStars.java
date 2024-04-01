public class PS_15_KStars {
    public static void main(String[] args) {

        // ****
        // ***
        // **
        // *
        // **
        // ***
        // ****

        // For Upper Reverse Right Triangle:
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= (4 - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For Lower Right Triangle:
        for (int i = 3; i >= 1; i--) {

            for (int j = 4; j >= i; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
